package JAVA_ADVANCED;

public class PISHTOV {
    public static void main(String[] args) {




    /*

                Създаване на шорткътове   Settings | Live Templates
                (погледни как са конфигурирани оригинално)


                МИГАЩ В ЧЕРНО КУРСОР - натисни - (Insert)  / fn + delete /

          Ctrl + /           Shift + F6   КОПИРА И ЗАМЕНЯ ВСИЧКО

           Ctrl + Alt + L ---  podrejda koda
          Ctrl + D       ---  dublira reda na koito si
          Ctrl + Z       ---  nazad
          Ctrl + Shift + Z   ---  napred
          Ctrl + F  -  Find
          Ctrl + R  -  Refactor
Get & Set - Alt + Insert
live templates -

          int a = (int) Math.ceil(b/0.5);


                           /n %n - nov red
                           %c - Char
          souf     -->     %s - String
          BigInteger >     %d - Integer  2 147 483 647                        long > int > short > byte
          BigDecimal >     %f - Double    %.2f   -  2znaka sled desetichnata      double > float

          BigInteger numberOne = new BigInteger(scanner.nextLine());
          BigInteger numberTwo = new BigInteger(scanner.nextLine());
          BigInteger sum = numberOne.add(numberTwo);

          BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < n; i++) {
            BigDecimal pesho = new BigDecimal(scanner.nextLine());
            sum = sum.add(pesho);
        }




  @       System.out.println(new DecimalFormat("0.##").format(calculate(int1,operationSymbol,int2)));
  @
  @
  @       DecimalFormat NAMEofFORMAT = new DecimalFormat("0.#####");
  @       for (int i = 0; i < LIST.size(); i++) {
  @          System.out.print(NAMEofFORMAT.format(LIST.get(i)) + " ");
  @     }


             anyInput.iter + tab ---> директно създава foreach цикъл

             String input = "";
             while (!"Clone them!".equals(input = scanner.nextLine())){

             -code-
             -code-
             -code-

             input = scanner.nextLine();
             }


                                                                                                               ARRAYS

            String[] words = scanner.nextLine().split("\\s+");

        int[] plants = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();



            while (!SomeLIST.isEmpty()) {
                Random rdm = new Random();
                int randomIndex = rdm.nextInt(SomeLIST.size());

                String word = SomeLIST.get(randomIndex);
                System.out.println(word);
                SomeLIST.remove(randomIndex);
            }


                                                                                                                  MAP


                                      HashMap   ->   NE SORTIRA
                                      TreeMap   ->   AZBUCHEN RED
                                LinkedHashMap   ->   PO POSLEDOVATELNOST NA VKARVANE

                                Set = List   но сет пази уникални стойности



               contryAndTotalPpl.entrySet().stream()
                  .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                  .forEach(e -> {           // podrejda map po stoinost v nizhodyasht red  5..4..3..2..1




        firstSet.retainAll(secondSet); >> maha vsichki elementi ot set1 ako v set2 gi nyama






        for (Double number : nameMap.keySet()) {
            System.out.printf("%.1f -> %d%n",number,nameMap.get(number));
        }

        for (Map.Entry<Double,Integer> entry : nameMap.entrySet()){
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());

        }

                                            >>>>>>>>>>>>>>>>>>>>>>>  AVERAGE VALUE ot <STRING, ARRAYLIST<DOUBLE>>

        student.entrySet().stream().forEach(entry -> {
            double avrSum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                avrSum += entry.getValue().get(i)
            }
            avrSum = avrSum / entry.getValue().size();
            System.out.printf("%s -> ",entry.getKey());
            entry.getValue().forEach(e-> System.out.printf("%.2f ",e));
            System.out.printf("(avg: %.2f)%n",avrSum);
        }
    );

                                                                    >>>>>>>>>>>>>>>>>>




                                                                                                              SORTED


                contryAndTotalPpl.entrySet().stream()
                  .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                  .forEach(e -> {           // podrejda map po stoinost v nizhodyasht red  5..4..3..2..1



   987654321  &  abcd

                 keyMaterials.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                            int sort = Integer.compare(e2.getValue(), e1.getValue());
                            if (sort == 0) {
                                sort = e1.getKey().compareTo(e2.getKey());
                            }
                            return sort;
                        }

    abcd...
                junk.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))

                                                                                                                ERROR
                                              Runtime error - imash greshka v koda




                                                                                                                REGEX

                            *  -  0- ili poveche
                            +  -  1 - ili poveche puti
                            ?  -  0 ili 1 putgoima neshtoto predi znaka
                            {cifra}  -  kolko puti da go ima neshtoto

                            \w+    ->  [A-Z,a-z,0-9,_]
                            \W+     - obratnoto na w
                            \s - speisove
                            \S  -  vsichko osven speisove
                            \d  -  vsichki cifri
                            \D  -  vsichko osven cifri




                                                                                                         ARRAYDEQUE


                         anyInput.iter + tab ---> директно създава foreach цикъл
                         Collections.addAll(calculatorItems, input);  --> пълни колекцията (още нз как)
                         System.out.println(Collections.min(arrayNums));   намира мин и макс цифра в стек и опашка
                         System.out.println(Collections.max(arrayNums));



                    push    )
                    pop     --> LIFO
                    peak    )
                    -----------------
                    offer   )
                    poll    --> FIFO























*/
    }
}
















