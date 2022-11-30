package br.com.consuming.postalcode.api.client;

import br.com.consuming.postalcode.api.cep.PostalCodeService;
import br.com.consuming.postalcodeapi.domain.Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Inform your postal code: ");
        String postalCode = new Scanner(System.in).nextLine();

        Address address = PostalCodeService.searchFor(postalCode);
        System.out.println(address);
    }
}
