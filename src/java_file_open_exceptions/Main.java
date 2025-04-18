/* License

This project is licensed under the GNU General Public License v3.0.

Copyright (c) 2025 Enis Çetinkaya

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
*/
package java_file_open_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File dosya = new File("ornek.txt");
		try {

			if (dosya.createNewFile()) {

				System.out.println("Dosya oluşturuldu\n" + dosya.getName());

			} else {

				System.out.println("Dosya zaten mevcut.");

			}

		} catch (IOException e) {

			System.out.println("Hata oluştu");
			e.printStackTrace();

		}

		try {

			FileWriter fileWriter = new FileWriter("ornek.txt");
			fileWriter.write("Merhaba Java");
			fileWriter.close();

			System.out.println("Dosyaya yazıldı.");

		} catch (IOException e) {

			System.out.println("Yazma hatası!");
			e.printStackTrace();

		}

		try {

			File newFile = new File("ornek.txt");
			Scanner scanner = new Scanner(newFile);
			while (scanner.hasNextLine()) {

				String string = (String) scanner.nextLine();
				System.out.println(string);

			}

			scanner.close();

		} catch (FileNotFoundException e) {

			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();

		}

		if (dosya.delete()) {

			System.out.println("Dosya silindi\n" + dosya.getName());

		} else {

			System.out.println("Silinemedi!");

		}


	}

}
