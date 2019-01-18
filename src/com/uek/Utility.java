package com.uek;

import java.util.*;
/**
* 类名称: Utility
* 类描述:   接收键盘输入的工具类：
* 创建人： 优逸客大数据开发团队  
* 创建时间： 2019年1月17日
 */
public class Utility {
	
    private static Scanner scanner = new Scanner(System.in);
    /**
     * 读取菜单选项：
     * @return
     */
	public static char readMenuSelection() {

        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0); //获取字符串中的第一个字符
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }
    /**
     * 读取5位以内数字：
     * @return
     */
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(5); 
            try {
            	// Integer.parseInt :     Integer 属于一个类（基本数据类型的包装类）
            	//parseInt ：可以把一个包含数字的字符串转换int类型的数字 ：“1111” -- > 1111
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }
    /**
     * 读取长度8以内的字符串：
     * @return
     */
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }
    /**
     * 读取选项：
     * @return
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
        	//toUpperCase() : 将接收的字母转成大写字母： y n --->Y  N
            String str = readKeyBoard(1).toUpperCase();
            //charAt(索引) : 将字符串中的某一个字符抽取出来；
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }
    
    /**
     * 读取指定长度的字符串：
     * @param limit       接收键盘输入字符串的长度
     * @return
     */
    private static String readKeyBoard(int limit) {
    	
        String line = "";
        //scanner.hasNext() :  是否有键盘输入的内容，返回的是一个布尔值；
        // 该方法属于一个遍历的方法，它包含一个游标的概念；
        while (scanner.hasNext()) {
            line = scanner.nextLine();  // 接收一行内容
           //如果输入的字符串的长度小于1 或者大于指定的长度：
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break; 
        }

        return line;
    }

    
    public static void main(String[] args) {
		
/*    	while(scanner.hasNext()){
    		System.out.println(scanner.nextLine()); //打印输入键盘输入
    	}*/
    	
    	if(scanner.hasNext()){
    		System.out.println(scanner.nextLine());
    	}
	}

}



















