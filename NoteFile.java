public class NoteFile{
    File file;

	public ViduFile(String tenFile) {
		this.file = new File(tenFile);
	}

	public boolean kiemTraThucThi() {
		// Kiểm tra file có thể thực thi
		return this.file.canExecute();
	}

	public boolean kiemTraDoc() {
		// Kiểm tra file có thể đọc
		return this.file.canRead();
	}

	public boolean kiemTraGhi() {
		// Kiểm tra file có thể ghi
		return this.file.canWrite();
	}

	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}

	public void inTen() {
		System.out.println(this.file.getName());
	}

	public void kiemTraLaThuMucHoacTapTin() {
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục");
		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
	}

	public void inDanhSachCacFileCon() {
		if (this.file.isDirectory()) {
			System.out.println("Các tập tin con/ thư mục con là:");
			File[] mangCon = this.file.listFiles();
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin, không có dữ liệu con bên trong.");
		}
	}

	public void inCayThuMuc() {
		this.inChiTietCayThucMuc(this.file, 1);
	}

	public void inChiTietCayThucMuc(File f, int bac) {
//		System.out.print("|");
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead()&&f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThucMuc(fx, bac + 1);
			}
		}
		
	}
    public static void xoaFile(File fx) {
		if(fx.isFile()) {
			// Xoa neu la tap tin
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}else if (fx.isDirectory()) {
			// Lay cac file con
			File[] mangCon = fx.listFiles();
			for(File f: mangCon) {
				// Xoa cac file con
				xoaFile(f);
			}
			// Xoa ban than thu muc sau khi da xoa cac file con
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}
	}

    public static void copyAll(File f1, File f2) {
		try {
			// Copy ban than no
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f1.isDirectory()){
			// Copy cac tap tin va thu muc con
			File[] mangCon = f1.listFiles();
			for (File file : mangCon) {
				File file_new = new File(f2.getAbsoluteFile()+"/"+file.getName());
				copyAll(file, file_new);
			}
		}
	}
	
	
	public static void main(String[] args) {
		File f0 = new File("/Users/mac/eclipse-workspace/Java_70/File_1.txt");
		File f1 = new File("/Users/mac/eclipse-workspace/Java_70/File_2.txt");
		File f2 = new File("/Users/mac/eclipse-workspace/Java_70/File_2xyz.txt");
		
		//1. Thay doi ten tap tin hoac thu muc
		// Su dung File de thay doi ten
		f0.renameTo(f1);
		
		// Su dung Files de thay doi ten
		try {
			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. Di chuyen file
		File f_2new= new File("/Users/mac/eclipse-workspace/Java_70/F0/File_2xyz.txt");
		try {
			Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File folder_1 =  new File("/Users/mac/eclipse-workspace/Java_70/F1");
		File folder_1new =  new File("/Users/mac/eclipse-workspace/Java_70/F0/F1");
		try {
			Files.move(folder_1.toPath(), folder_1new.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3. Copy file
		File f_0 = new File("/Users/mac/eclipse-workspace/Java_70/F0");
		File f_0_copy = new File("/Users/mac/eclipse-workspace/Java_70/F0_copy");
//		try {
//			Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ViDuFile.copyAll(f_0, f_0_copy);
		
	}
}