package com.example.fintech.paymentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class FinTechPaymentPlatformDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FinTechPaymentPlatformDemoApplication.class, args);
		FinTechPaymentPlatformDemoApplication a = new FinTechPaymentPlatformDemoApplication();
		int[] output=a.twoSum(new int[]{1,2,3,4,5}, 5);
		System.out.println(Arrays.toString(output));
	}

	public int[] twoSum(int[] nums, int target) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i=0; i< nums.length; i++){
			for (int j = 1; j<nums.length; j++){
				if (nums[i]+nums[j]==target)
					return new int[]{nums[i], nums[j]};
			}
		}
		return new int[]{-1};
	}



	}
