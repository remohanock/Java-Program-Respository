package com.felight.examples.co;

import java.io.FileInputStream;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class ReadWord {
	private static XWPFWordExtractor we;

	public static boolean readWord(String fileName) throws Exception {
		XWPFDocument docx = new XWPFDocument(new FileInputStream(fileName));
		we = new XWPFWordExtractor(docx);
		System.out.println(we.getText());
		return true;
	}
}
