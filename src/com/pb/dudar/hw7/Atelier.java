package com.pb.dudar.hw7;

public class Atelier {
    public static void main(String[] args) {

        Pants pants = new Pants("коричневые", Size.S, 999.99);
        Skirt skirt = new Skirt("чёрная", Size.M, 550);
        Tie tie = new Tie("в горошек", Size.L, 200);
        Tshirt tshirt = new Tshirt("белая", Size.XXS, 149.99);

        Clothes[] clothes = new Clothes[]{pants, skirt, tie, tshirt};
        dressMan(clothes);
        dressWomen(clothes);
    }

        public static void dressMan(Clothes[] clothes) {
            System.out.println("Мужская одежда:");
            for (Clothes clothing: clothes) {
                if (clothing instanceof ManClothes) {
                    ManClothes manClothes = (ManClothes) clothing;
                    manClothes.dressMan();
                }
            }
        }

        public static void dressWomen(Clothes[] clothes) {
            System.out.println("Женская одежда:");
            for (Clothes clothing: clothes) {
                if(clothing instanceof WomenClothes) {
                    WomenClothes womenClothes = (WomenClothes) clothing;
                    womenClothes.dressWomen();
                }

            }
        }
    }

