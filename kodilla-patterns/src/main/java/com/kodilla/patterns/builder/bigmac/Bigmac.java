package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Bigmac {

    private  String bun;
    private  int burgers;
    private  List<String> sauces = new ArrayList<>();
    private  List<String> ingrediends = new ArrayList<>();

    public static class BigmacBuilder {

        private  String bun;
        private  int burgers;
        private  List<String> sauces = new ArrayList<>();
        private  List<String> ingrediends = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(Integer burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce){
            sauces.add(sauce);
            return this;
        }

        public BigmacBuilder ingredient(String ingredient){
            ingrediends.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun,burgers,sauces,ingrediends);
        }


    }

    public Bigmac(final String bun,final int burgers, List<String> sauces, List<String> ingrediends) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauces = sauces;
        this.ingrediends = ingrediends;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public List<String> getIngrediends() {
        return ingrediends;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauces=" + sauces +
                ", ingrediends=" + ingrediends +
                '}';
    }
}
