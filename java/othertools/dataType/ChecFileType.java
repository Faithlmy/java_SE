package dataType;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * 思路已经建立，有些文件不能识别
 * */
public class ChecFileType {
	
	 public static final HashMap<String, String> mFileTypes = new HashMap<String, String>();
	 static {
		 // img
		 mFileTypes.put("FFD8FF", "jpg");
		 mFileTypes.put("89504E47", "png");
		 mFileTypes.put("47494638", "gif");
		 mFileTypes.put("424D", "bmp");
		 mFileTypes.put("49492A00", "tif");
		 //压缩包
		 mFileTypes.put("504B0304", "zip");
		 mFileTypes.put("52617221", "rar");
		 mFileTypes.put("377ABCAF271C", "7z");
		 mFileTypes.put("1F8B08", "gz");
		 mFileTypes.put("425a", "bz");
		 
		 //
		 mFileTypes.put("D0CF11E0", "doc");
		 mFileTypes.put("D0CF11E0", "xls");
		 mFileTypes.put("504B0304", "docx");
		 mFileTypes.put("504B0304", "xlsx");
		 mFileTypes.put("3C3F786D6C", "xml");
		 mFileTypes.put("68746D6C3E", "html");
		 mFileTypes.put("03F30D0A", "pyc");
		 mFileTypes.put("4D5A9000", "pyd");
		 mFileTypes.put("255044462D312E", "pdf");
		 mFileTypes.put("41433130", "dwg");
		 mFileTypes.put("38425053", "psd");
		 mFileTypes.put("7B5C727466", "rtf");
		 mFileTypes.put("CFAD12FEC5FD746F", "dbx");
		 mFileTypes.put("2142444E", "pst");
		 mFileTypes.put("5374616E64617264204A", "mdb");
		 mFileTypes.put("FF575043", "wpd");
		 mFileTypes.put("AC9EBD8F", "qdf");
		 mFileTypes.put("E3828596", "pwl");
		 mFileTypes.put("57415645", "wav");
		 mFileTypes.put("41564920", "avi");
		 mFileTypes.put("2E7261FD", "ram");
		 mFileTypes.put("2E524D46", "rm");
		 mFileTypes.put("000001BA", "mpg");
		 mFileTypes.put("000001B3", "mpg");
		 mFileTypes.put("6D6F6F76", "mov");
		 mFileTypes.put("3026B2758E66CF11", "asf");
		 mFileTypes.put("4D546864", "mid");
		 mFileTypes.put("FFD8FF", "jpg");
		 mFileTypes.put("FFD8FF", "jpg");
		 mFileTypes.put("FFD8FF", "jpg");
	 }

	 //获取文件头信息
	 public static String getFileHeader(String filePath) {
		 String value = null;
		 FileInputStream fileHead = null;
		 try {
			fileHead = new FileInputStream(filePath);
			byte[] fileByte = new byte[4];
			fileHead.read(fileByte, 0, fileByte.length);
			value = bytesToHexString(fileByte);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fileHead != null) {
				try {
					fileHead.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		 return value;
	 }
	 
	 // 将头文件的十六 进制转换成string
	 /**
	  * this  <code> is   
	  * @Description：
	  * @Author:
	  * @Date:
	  * @Version:
	  */
	 public static String bytesToHexString(byte[] arr) {
		 String res = null;
		 StringBuilder stringBuilder = new StringBuilder();
		 if(arr == null || arr.length == 0)  return null;
		 String hv;
		 try {
			for(int i = 0; i < arr.length; i++) {
			      // 以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式，并转换为大写  
	            hv = Integer.toHexString(arr[i] & 0xFF).toUpperCase();  
	            if(hv.length() < 2) {
	            	stringBuilder.append(0);
	            }
	            stringBuilder.append(hv);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return stringBuilder.toString();
	 }
	 
	 
	 public static String getFileType(String filePath) {
		 return mFileTypes.get(getFileHeader(filePath));
	 }
	 
	 public static void main(String[] args) {
		 String Path = "D:\\0";
		 List resType = new ArrayList<>();
//		final String fileType = getFileType("D:\\0\\fd.rar");
//		System.out.println(fileType);
		 TurnRun tr = new TurnRun();
		 List resArr  = new ArrayList<>();
		 try {
			 resArr = tr.scanFile(Path, 1);
			 System.out.println(resArr);
			 for(int i = 0; i < resArr.size(); i++) {
 				 resType.add(getFileType(resArr.get(i).toString()));
			 }
			 System.out.println(resType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
