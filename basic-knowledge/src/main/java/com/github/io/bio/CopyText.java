
package com.github.io.bio;

import java.io.*;

/**
 * 字符流读取文本文件
 */
class CopyText {
	public static void main(String[] args) throws IOException {
		copyFile();
	}

	/**
	 * 将文件SystemDemo.java 复制成 SystemDemo_copy.txt
	 */
	public static void copyFile() {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("SystemDemo_copy.txt");
			fr = new FileReader("SystemDemo.java");

			char[] buf = new char[1024];

			int len = 0;
			while ((len = fr.read(buf)) != -1) {
				fw.write(buf, 0, len);
			}
		} catch (IOException e) {
			throw new RuntimeException("读写失败");

		} finally {
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
				}
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
				}
		}
	}

}
