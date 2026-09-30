package pt.aeresende.progs;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String nome = "programação de sistemas";
        System.out.println(StringUtils.capitalize(nome));
        System.out.println(StringUtils.reverse(nome));
        System.out.println(StringUtils.abbreviate(nome, 14));
        System.out.println(StringUtils.center("3F", 10, '*'));
    }
}
