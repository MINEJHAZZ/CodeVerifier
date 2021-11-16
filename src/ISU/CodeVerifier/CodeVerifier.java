/*
 * Copyright (C) 2021 MINEJHAZZ
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ISU.CodeVerifier;

/**
 *
 * @author MINEJHAZZ
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CodeVerifier {
    //Line Breaks
static void FN(){
  System.out.print("\n\n\n\n");
}

static void TN(){
  System.out.println("\n");
}

static void SN(){
  System.out.print("\n");
}
    
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        
        String Code, CodeT;
        double d1, d2, d3, d4, d5 ,d6, d7, d8, d9, d10, d11, d12=0, d13=0, d14=0, d15=0, d16=0;
        double d1s=0, d3s=0, d5s=0,d7s=0,d9s=0,d11s=0,d13s=0,d15s=0;
        double CodeAns;
        
        System.out.print("Enter Code: ");
        Code = in.nextLine();
        
        SN();
        String[] CodeA = Code.split("");
        d1 = Double.parseDouble(CodeA[0]);
        d2 = Double.parseDouble(CodeA[1]);
        d3 = Double.parseDouble(CodeA[2]);
        d4 = Double.parseDouble(CodeA[3]);
        d5 = Double.parseDouble(CodeA[4]);
        d6 = Double.parseDouble(CodeA[5]);
        d7 = Double.parseDouble(CodeA[6]);
        d8 = Double.parseDouble(CodeA[7]);
        d9 = Double.parseDouble(CodeA[8]);
        d10 = Double.parseDouble(CodeA[9]);
        d11 = Double.parseDouble(CodeA[10]);
        System.out.println("You have entered 11 Numbers.");
        if(CodeA.length >= 12){
            d12 = Double.parseDouble(CodeA[11]);
            System.out.println("You have entered 12 Numbers.");
            
            if(CodeA.length >= 13){
                d13 = Double.parseDouble(CodeA[12]);
                System.out.println("You have entered 13 Numbers.");
                
                if(CodeA.length >= 14){
                    d14 = Double.parseDouble(CodeA[13]);
                    System.out.println("You have entered 14 Numbers.");
                    
                    if(CodeA.length >= 15){
                        d15 = Double.parseDouble(CodeA[14]);
                        System.out.println("You have entered 15 Numbers.");
                        
                        if(CodeA.length >= 16){
                            d16 = Double.parseDouble(CodeA[15]);
                            System.out.println("You have entered 16 Numbers.");
                        }
                    }
                }
            }
        }
        
        System.out.print("Enter Code Type(ISBN/UPC/Credit): ");
        CodeT = in.nextLine();
        
        if (CodeT.equalsIgnoreCase("ISBN")){
            CodeAns = (d1)+(3*d2)+(d3)+(3*d4)+(d5)+(3*d6)+(d7)+(3*d8)+(d9)+(3*d10)+(d11)+(3*d12);
            System.out.print("Total of ISBN is: "+CodeAns);
        } else if (CodeT.equalsIgnoreCase("UPC")){
            CodeAns = (3*d1)+(d2)+(3*d3)+(d4)+(3*d5)+(d6)+(3*d7)+(d8)+(3*d9)+(d10)+(3*d11);
            
            System.out.println("𝑑_12 = 10 – (3𝑑_1+𝑑_2+3𝑑_3+𝑑_4+3𝑑_5+𝑑_6+3𝑑_7+𝑑_8+3𝑑_9+𝑑_10+3𝑑_11)mod 10.");
            System.out.println("𝑑_12 = 10 – [3("+df.format(d1)+")+"+df.format(d2)+"+3("+df.format(d3)+")+"+df.format(d4)+"+3("+df.format(d5)+")+"+df.format(d6)+"+3("+df.format(d7)+")+"+df.format(d8)+"+3("+df.format(d9)+")+"+df.format(d10)+"+3("+df.format(d11)+")]mod 10.");
            d1 = 3*d1;
            d2 = d2;
            d3 = 3*d3;
            d4 = d4;
            d5 = 3*d5;
            d6 = d6;
            d7 = 3*d7;
            d8 = d8;
            d9 = 3*d9;
            d10 = d10;
            d11 = 3*d11;
            System.out.println("𝑑_12 = 10 – ["+df.format(d1)+" + "+df.format(d2)+" + "+df.format(d3)+" + "+df.format(d4)+" + "+df.format(d5)+" + "+df.format(d6)+" + "+df.format(d7)+" + "+df.format(d8)+" + "+df.format(d9)+" + "+df.format(d10)+" + "+df.format(d11)+")mod 10.");
            System.out.print("𝑑_12 = 10 – "+df.format(CodeAns)+"mod 10");
            
        } else if (CodeT.equalsIgnoreCase("Credit")){
            String EQ1 = df.format(d1)+" "+df.format(d2)+" "+df.format(d3)+" "+df.format(d4)+" "+df.format(d5)+" "+df.format(d6)+" "+df.format(d7)+" "+df.format(d8)+" "+df.format(d9)+" "+df.format(d10)+" "+df.format(d11)+" "+df.format(d12)+" "+df.format(d13)+" "+df.format(d14)+" "+df.format(d15)+" "+df.format(d16);
            String EQ2 = df.format(d1*2)+" "+df.format(d2)+" "+df.format(d3*2)+" "+df.format(d4)+" "+df.format(d5*2)+" "+df.format(d6)+" "+df.format(d7*2)+" "+df.format(d8)+" "+df.format(d9*2)+" "+df.format(d10)+" "+df.format(d11*2)+" "+df.format(d12)+" "+df.format(d13*2)+" "+df.format(d14)+" "+df.format(d15*2)+" "+df.format(d16);
            
            String[] d1S = Double.toString(d1*2).split("");
            d1 = Double.parseDouble(d1S[0]);
            if(d1S.length >= 2){
                d1s = Double.parseDouble(d1S[1]);
            }
            
            d2 = d2;
            String[] d3S = Double.toString(d3*2).split("");
            d3 = Double.parseDouble(d3S[0]);
            if(d3S.length >= 2){
                if(!d3S[1].equalsIgnoreCase(".")){
                d3s = Double.parseDouble(d3S[1]);
                }
            }
            
            d4 = d4;
            String[] d5S = Double.toString(d5*2).split("");
            d5 = Double.parseDouble(d5S[0]);
            if(d5S.length >= 2){
                if(!d5S[1].equalsIgnoreCase(".")){
                d5s = Double.parseDouble(d5S[1]);
                }
            }
            
            d6 = d6;
            String[] d7S = Double.toString(d7*2).split("");
            d7 = Double.parseDouble(d7S[0]);
            if(d7S.length >= 2){
                if(!d7S[1].equalsIgnoreCase(".")){
                d7s = Double.parseDouble(d7S[1]);
                }
            }
            
            d8 = d8;
            String[] d9S = Double.toString(d9*2).split("");
            d9 = Double.parseDouble(d9S[0]);
            if(d9S.length >= 2){
                if(!d9S[1].equalsIgnoreCase(".")){
                d9s = Double.parseDouble(d9S[1]);
                }
            }
            
            d10 = d10;
            String[] d11S = Double.toString(d11*2).split("");
            d11 = Double.parseDouble(d11S[0]);
            if(d11S.length >= 2){
                if(!d11S[1].equalsIgnoreCase(".")){
                d11s = Double.parseDouble(d11S[1]);
                }
            }
            
            if(CodeA.length >= 12){
                d12 = d12;
                
                if(CodeA.length >= 13){
                    String d13S[] = Double.toString(d13*2).split("");
                    d13 = Double.parseDouble(d13S[0]);
                    if(d13S.length >= 2){
                        if(!d13S[1].equalsIgnoreCase(".")){
                        d13s = Double.parseDouble(d13S[1]);
                        }
                    }
                    
                    if(CodeA.length >= 14){
                        d14 = d14;
                        
                        if(CodeA.length >= 15){
                           String d15S[] = Double.toString(d15*2).split("");
                           d15 = Double.parseDouble(d15S[0]);
                           if(d15S.length >= 2){
                               if(!d15S[1].equalsIgnoreCase(".")){
                               d15s = Double.parseDouble(d15S[1]);
                               }
                           }   
                          if(CodeA.length >= 16){
                                d16 = d16;
                            }
                        }
                    }
                }
            }
            //start
            CodeAns = (d1+d1s)+d2+(d3+d3s)+d4+(d5+d5s)+d6+(d7+d7s)+d8+(d9+d9s)+d10+(d11+d11s)+d12+(d13+d13s)+d14+(d15+d15s)+d16;
            TN();
            System.out.println(EQ1);
            System.out.println("2x  2x  2x  2x  2x  2x  2x  2x");
            System.out.println(EQ2);
            SN();
            System.out.println("= ("+df.format(d1)+"+"+df.format(d1s)+") + "+df.format(d2)+" + ("+df.format(d3)+"+"+df.format(d3s)+") + "+df.format(d4)+" + ("+df.format(d5)+"+"+df.format(d5s)+") + "+df.format(d6)+" + ("+df.format(d7)+"+"+df.format(d7s)+") + "+df.format(d8)+" + ("+df.format(d9)+"+"+df.format(d9s)+") + "+df.format(d10)+" + ("+df.format(d11)+"+"+df.format(d11s)+") + "+df.format(d12)+" + ("+df.format(d13)+"+"+df.format(d13s)+") + "+df.format(d14)+" + ("+df.format(d15)+"+"+df.format(d15s)+") + "+df.format(d16));
            System.out.println("= "+df.format(CodeAns));
            
        }
        
    }    
}
