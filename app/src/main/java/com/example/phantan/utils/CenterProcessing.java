package com.example.phantan.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class CenterProcessing {

	public static long modulo(long arg0, long arg1) {
		if (arg0 > 0)
			return arg0 % arg1;
		else
			return arg0 + arg1;
	}

	public static ArrayList<Long> demicalToBinary(long a) {
		ArrayList<Long> rs = new ArrayList<>();
		while (a > 0) {
			rs.add(a % 2);
			a /= 2;
		}
		return rs;
	}

	/* T�nh a^b modulo m */
	public static ArrayList<String> modulo(long a, long b, long m) {
		ArrayList<String> rs = new ArrayList<>();
		String title = "i---a(i)---x---p";
		//System.out.println(title);
		rs.add(title);
		long i = 0;
		long tmpb = b;
		long p = -1, ai;// p0=a mod m
		long x = 1;// x0 = 1

		while (tmpb > 0) {
			ai = tmpb % 2;// ai binary element
			if (i == 0) {
				p = modulo(a, m);
			} else {
				p = modulo((long) Math.pow(p, 2), m);// x1 =( x0 * p0^a1 ) mod m
			}
			x = modulo(x * (long) Math.pow(p, ai), m);// p1 = p0^2 mod m
			String rcd = String.valueOf(i) + "---" + String.valueOf(ai) + "---" + String.valueOf(x) + "---"
					+ String.valueOf(p);
			//System.out.println(rcd);
			rs.add(rcd);
			tmpb /= 2;
			i++;
		}
		return rs;

	}

	public static ArrayList<String> gcdDetails(long a, long b) {
		ArrayList<String> arrayList = new ArrayList<>();
		if (a < b)
			return null;
		int couter = 0;
		while (b != 0) {
			long aModB = CenterProcessing.modulo(a, b);
			String rs = String.valueOf(couter) + "---" + String.valueOf(a) + "---" + String.valueOf(b) + "---"
					+ String.valueOf(aModB);
			arrayList.add(rs);
			a = b;
			b = aModB;
			couter++;
			System.out.println(rs);
		}

		return arrayList;
	}
	public static void replaceArrayListDataWithArrayList(ArrayList<String>arrayList,ArrayList<String> newData){
		arrayList.removeAll(arrayList);
		arrayList.addAll(newData);
	}

}
