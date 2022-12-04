package me.hunman.designpatterns.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import main.java.me.hunman.designpatterns.singleton.Settings;

public class SingletonApplication {

	public static void main(String[] args) {
		Settings settings = Settings.getInstance();
		Settings settings2 = Settings.getInstance();
		System.out.println(settings == settings2);
	}

}
