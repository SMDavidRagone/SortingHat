import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class imagerotator extends DrawingPanel
{

	public imagerotator(Color mc, int w, int h, JFrame f) {
		super(mc, w, h, f);
		// TODO Auto-generated constructor stub
	}
	/*BufferedImage img = null;
	try {
	    img = ImageIO.read(new File("drawSmiley.jpg"));
	} catch (IOException e) {
	}
	*/
	public void rotateImage(BufferedImage pic1) throws IOException {
	int width = pic1.getWidth(null);
	int height = pic1.getHeight(null);

		// point to rotate about center of image
		double x0 = 0.5 * (width - 1);
		double y0 = 0.5 * (height - 1);

		int sum = (int) (y0 + x0);
		int difference = (int) (y0 - x0);

		WritableRaster inRaster = pic1.getRaster();
		BufferedImage pic2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		WritableRaster outRaster = pic2.getRaster();
	 	int[] pixel = new int[3];

		// rotation
		int right = Math.min(width, height - difference);
		int bottom = Math.min(height, sum + 1);
		for (int x = Math.max(0, -difference); x < right; x++) {
			for (int y = Math.max(0, sum - width + 1); y < bottom; y++) {
				int xx = sum - y;
				int yy = difference + x;

				outRaster.setPixel(x, y, inRaster.getPixel(xx, yy, pixel));
			}
		}

		ImageIO.write(pic2, "bmp", new File("Images/Output2.bmp"));
	}

}
