/*
	ShowHiddenFilesAlso
	Copyright (C) 2020 Davide Sestili
	
	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.
	
	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.
	
	You should have received a copy of the GNU General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import java.io.File;
import java.util.Arrays;

public class SHFA {

	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.out.println("param required");
			return;
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists())
		{
			System.out.println("Does not exist");
			return;
		}
		
		if(!dir.isDirectory())
		{
			System.out.println("Is not a dir");
			return;
		}
		
		File[] sub = dir.listFiles();
		
		Arrays.sort(sub);
		
		for(File f : sub)
		{
			System.out.println(f.getAbsolutePath());
		}
	}

}
