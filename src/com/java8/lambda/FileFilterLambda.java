package com.java8.lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		
		FileFilter fileFilter = new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
			
		};
		File directoryFile = new File("\\users\\myfirstmac\\labs-proj");
		/*
		 * File[] files = directoryFile.listFiles(fileFilter); for(File file :files) {
		 * System.out.println(file.getName()); }
		 */
		
		FileFilter lambdaFileFilter = (File pathname) -> pathname.getName().endsWith(".java");
		/*
		 * FileFilter lambdaFileFilter = (pathname) ->
		 * pathname.getName().endsWith(".java"); FileFilter lambdaFileFilter = pathname
		 * -> pathname.getName().endsWith(".java");
		 */
		/*
		 * File[] files = directoryFile.listFiles(lambdaFileFilter); for(File file :
		 * files) { System.out.println(file.getName()); }
		 */
		
		File[] files = directoryFile.listFiles(pathname -> pathname.getName().endsWith(".java"));
		for (File file:files) {
			System.out.println(file.getName());
		}
	}
}
