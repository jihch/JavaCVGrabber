package priv.jihch.javacv.test.JavaCV_test;

import static org.bytedeco.javacpp.opencv_highgui.imshow;
import static org.bytedeco.javacpp.opencv_highgui.waitKey;
import static org.bytedeco.javacpp.opencv_imgcodecs.imread;

import org.bytedeco.javacpp.opencv_core.Mat;

/**
 * 加载显示图片
 * @author Administrator
 *
 */
public class HelloJavaCV {
	
	public static void main(String[] args) {
		// 读取原始图片
		String filename = "F:\\2018\\201808\\20180806\\testA.jpg";
		Mat image = imread(filename);
		if (image.empty()) {
			System.err.println("加载图片出错，请检查图片路径！");
			return;
		}
		// 显示图片
		imshow("显示原始图像", image);

		// 无限等待按键按下
		waitKey(0);
	}

}
