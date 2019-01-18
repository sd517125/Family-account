package com.uek;

public class Main {

	public static void main(String[] args) {

		System.out.println();
		Person person = new Person();
		person.setMoney(10000);

		String str = "----------当前收支明细记录----------\n收支\t账号金额\t收支金额\t说明\n";
		int money = 0;
		String s = "";

		boolean flag = true;

		while(flag) {
			Page.show();
			char menu = Utility.readMenuSelection();
			switch(menu) {
				case '1':
					System.out.println(str);
					System.out.println();
					break;
				case '2':
					System.out.print("本次收入金额：");
					money = Utility.readNumber();
					person.setMoney(person.getMoney()+money);
					System.out.print("本次收入说明：");
					s = Utility.readString();
					str += "收入\t" + person.getMoney() + "\t" + money + "\t" + s + "\n";
					break;
				case '3':
					System.out.print("本次支出金额：");
					money = Utility.readNumber();
					person.setMoney(person.getMoney()-money);
					System.out.print("本次支出说明：");
					s = Utility.readString();
					str += "支出\t" + person.getMoney() + "\t" + money + "\t" + s + "\n";
					break;
				case '4':
					System.out.print("确认是否退出（Y/N）:");
					char c = Utility.readConfirmSelection();
					if(c=='Y')
						flag = false;
					break;
			}
		}
	}
}
