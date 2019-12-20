package com.techelevator;

import com.techelevator.view.Menu;

public class ExampleCLI {

	private static final String MAIN_MENU_OPTION_DO_SOMETHING = "Do Something";
	private static final String MAIN_MENU_OPTION_DO_SOMETHING_ELSE = "Do Something Else";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DO_SOMETHING, MAIN_MENU_OPTION_DO_SOMETHING_ELSE };

	private Menu menu;

	public ExampleCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DO_SOMETHING)) {
				System.out.println("****");
				System.out.println("Doin' something!");
				System.out.println("****");
			} else if (choice.equals(MAIN_MENU_OPTION_DO_SOMETHING_ELSE)) {
				System.out.println("****");
				System.out.println("Doin' something else!");
				System.out.println("****");
			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		ExampleCLI cli = new ExampleCLI(menu);
		cli.run();
	}
}
