package com.devsuperior.challenge;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.challenge.entities.Order;
import com.devsuperior.challenge.services.OrderService;

@SpringBootApplication
public class ChallengeApplication implements CommandLineRunner{
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Enter =======");
		int cod=sc.nextInt();
		double basic=sc.nextDouble();
		double discount=sc.nextDouble();
		
		Order order=new Order(cod,basic,discount);
		System.out.println("===== Out =======");
		System.out.println("Pedido código "+order.getCode());
		System.out.println("Valor total: "+orderService.total(order));
		
		
		sc.close();
		
	}

}
