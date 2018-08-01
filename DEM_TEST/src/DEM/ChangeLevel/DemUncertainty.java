package DEM.ChangeLevel;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.math3.distribution.NormalDistribution;

import Global.Global;
import asciiFunction.AsciiBasicControl;
import usualTool.AtFileWriter;

public class DemUncertainty {
	private AsciiBasicControl ascii;
	private int bufferGrid = 10;
	

	private static double normalMean = 0;
	private static double normalDis = 0.1;
//	private static NormalDistribution normal = new NormalDistribution(normalMean, normalDis);

	public DemUncertainty(String originalDemAdd) throws IOException {
		this.ascii = new AsciiBasicControl(originalDemAdd);
	}

	public void createNewDem(String saveAdd) throws IOException {
		ArrayList<String[]> outArray = new ArrayList<String[]>();
		String[][] asciiGrid = this.ascii.getAsciiGrid();

		for (String station : Global.getUncertaintyPosition().keySet().parallelStream().toArray(String[]::new)) {
			double twdX = Double.parseDouble(Global.getUncertaintyPosition().get(station)[0]);
			double twdY = Double.parseDouble(Global.getUncertaintyPosition().get(station)[1]);

			int[] gridPosition = this.ascii.getPosition(twdX, twdY);
			int column = gridPosition[0];
			int row = gridPosition[1];

			for (int temptRow = -1 * bufferGrid; temptRow <= bufferGrid; temptRow++) {
				for (int temptColumn = -1 * bufferGrid; temptColumn <= bufferGrid; temptColumn++) {
					double temptValue =Double.parseDouble(asciiGrid[row + temptRow][column + temptColumn])	+ DemUncertainty.normal.sample();
					asciiGrid[row + temptRow][column + temptColumn] = new BigDecimal(temptValue).setScale(3, BigDecimal.ROUND_HALF_UP).toString();
				}
			}
		}
		outArray.addAll(Arrays.asList(ascii.getPropertyText()));
		outArray.addAll(Arrays.asList(asciiGrid));
		
//		new AtFileWriter( outArray.parallelStream().toArray(String[][]::new) , saveAdd).textWriter("    ");
	}
}
