//! 6. Output, Comments - الاخراجات و التعليقات
// class App {
//     public static void main (String[] R){
//         System.out.print("Reda");/* هاي طلع الاوت بوت */
//         System.out.println("Emad");
//         System.out.println("Reda");/*البرنت لن تنزل سطر */
//         System.out.println("Reda "+"Emad");/* يجمع كلمتين*/
//         System.out.println("Reda "+"\n"+"Emad");/*ال \n تنزل سطر */
//         System.out.println("Reda "+"\t"+"Emad");/* ال \t تترك مسافة معينة بين النص*/
//         System.out.println("5+3");/* هذه يعتبره نص لان بين علاماتات تنصيص*/
//         System.out.println(5+3);/*هنا اعتبره ارقام وجمعهن  */
//     }
// }
//! 7. Variables - المتغيرات
// class App {
//     public static void main (String[] R2){
//         int g ;/*هنا عرفته وبعدين خليت قيمة  */
//         g=5;
//         int p,f,ss; /*هنا عرفت اكثر من قيمة بمره وحده */
//         int RR=4,HH=6;/*هنا عرفت بسطر واحد وخليت قيم بسطر واحد */
//         int x=7;/*عدد صحيح */
//         float y= 5.3f;/*عدد بي بوينت و انتبه هنا لازم تخلي اف وره الرقم
//         لأن حتى يعتبره فلوت */
//         double z=5.2 ; /* اعداد صحيحة اكثر*/
//         char a='s';/* معناهة رمز او حرف*/
//         String d="reda";/* سلسلة نصية تسخدم لتخزين النصوص*/
//         boolean e=false;/* القيم المنطقية اللي تكون يا اما ترو او فولس*/
//         System.out.println("x="+x);
//         System.out.println("y="+y);
//         System.out.println("z="+z);
//         System.out.println("a="+a);
//         System.out.println("d="+d);
//         System.out.println("e="+e);
//         System.out.println(RR+HH);/*هنا جمعت بالمتغيرات */
//     }
// }
//! 8. Type Casting - تغير نوع المتغير
// class App {
//     public static void main (String[] R3){
//       int  x=10;
//      float y ;
//     double z ;
//     y=x; 
/* تغير نوع الاكس من انتجر لفلوت
    بس هاي الطريقة مو مناسبة جواهة خوش طريقة 
    */
//     z=(double)x;/*هيج تحول نوع المتغير */
//         System.out.println(y);
//         System.out.println(z);
//         double g =6.7;
//         int r;
//         r=(int)g;/*هنا حولنه الفلوت الى انتجر وشال الفارزه المنقوطة */
//         System.out.println(r);
//         String num="10";/*هنا عندك سترنك شلون تحوله لقيمة رقمية بدل النصية */
//         int e , f;
//         e=Integer.parseInt(num);/*تستخدم هاي الشسمونة الدالة
//         طبعا هاي الداله هي كلاس موجود بالانتجر
//         */
//         f=Integer.valueOf(num);/*هاي هم داله تبدل من السترنك للانتجر */
//         System.out.println(e);
//          System.out.println(f);
//     }
// }
//! 9. Input - الادخالات
// import java.util.Scanner;
// class App{
//     public static void main(String []R4 ){
// System.out.print("Enter yor name : ");
// String name=new Scanner(System.in).nextLine();/*هاي البلوه كلهة علمود بس دخل نص 
// المهم النكست لاين تقره النصوص فقط الموجوده بهذه السطر*/
// System.out.println ("your Name is "+name );
// /*المدخلات نكدر نحددهة من خلال النيكست ويمهة اسم المدخل */
// int i=new Scanner(System.in).nextInt();
// double dob=new Scanner(System.in).nextDouble();
// float flo=new Scanner(System.in).nextFloat();
// boolean boo= new Scanner(System.in).nextBoolean();
// }
// }
//! 10. Age Calculator - برنامج معرفة العمر
// import java.util.Scanner;
// import java.util.Calendar ;//هذه الكلاس بي معرفه الوقت الحالي
// class App {
//     public static void main (String [] R5) {
// System.out.print("Enter you Birth years : ");
// int birthyear= new Scanner(System.in).nextInt();
// int yearsnow = Calendar.getInstance().get(Calendar.YEAR);//هاي هنا تكدر تعرف السنة الحالية تلقائيا
// int Age = yearsnow - birthyear  ;
// System.out.println("YOUR Age > "+ Age);
//     }
// }
//! 11. Operations
// class App {
//     public static void main(String[] R6){
// System.out.println(6+9);
// System.out.println(6-9);
// System.out.println(6*9);
// System.out.println(6/9);
// System.out.println(6%9);
// System.out.println("*************************");
// System.out.println(6+9/2);/* الاسبقية هنا للقسمة اذا اريد اخلي الاسبقية للجمع لازم اخليهن بين اقواس*/
// System.out.println((6+9)/2);/*هنا الاسبقية للجمع لأن خليت الاقواس */
// System.out.println((6+9)/2.0);/*هنا صار دوبل يعني عدد بي فارزة بدل ما جان انتجر */
// System.out.println(6>9);/*هنا لوجك راح يطلع false لأن غلط */
// System.out.println(6<9);/* هنا راح يطلع ترو لأن صح*/
// System.out.println(6>=6);
// System.out.println(6==6);
// System.out.println(6!=6);
// System.out.println(6>=6 && 5<3);/*اذا ما تحقق احد الشرطين معناها فولس */ /*AND */
// System.out.println(6>=6 || 5<3);/* اذا تحقق احد الشروط معناها ترو*/ /*OR */
// System.out.println(true);
// System.out.println(false);
// }
// }
//! 12. If Statements اذا الشرطية
// import java.util.Scanner ; 
// class App{
//     public static void main(String[] R7 )
//     {
//         System.out.print("Enter num : ");
//         int a = new Scanner(System.in).nextInt() ;
    
//         if (3<a){
            
//            System.out.println("Reda");
//         }
//         else if (3>a){
//            System.out.println("NO"); 
//         }
//         else {
//             System.out.println("Yes");}
//         }
        
//         //* */ int y = (4>2)? 4 : 6 ; /*شروط بسطر واحد  */
//         //* */ int d = (4>2)? ((9>1)? 4 : 7) : 6 ; /*شرط بداخل شرط */
//         //* */ System.out.println(y + " " + d);
        
//     }
// //* */ }
//! 13. Switch
// import java.util.Scanner ;
// class App {
//     public static void main(String[] R8){
// System.out.print("I love you 1 OR 0 ? :");
// int x =new Scanner(System.in).nextInt() ;
// switch(x){

//     case 0 : {System.out.println("why?");break;}/*لا تنسى البريك وره كل حاله حتى يتوقف عدهة البرنامج */
//     case 1 : System.out.println("I love you too");break;/*تكدر ما تضيف اقواس المجموعة اذا جان عندك سطر واحد داخل الحاله طبعا هذه الشي يشتغل ويا الاف و الفور ومدري شنو  */
//     default :  {System.out.println("Enter 1 OR 0 !");break;}
// }
//     }
// }
//! برنامج الحاسبة بالسويج
// import java.util.Scanner ;
 
// class App {
    
//     public static void main(String[] R8 ){
// System.out.print("Enter first num :");
// int x =new Scanner(System.in).nextInt() ;
// System.out.print("Enter Second num :");
// int y =new Scanner(System.in).nextInt() ;
// System.out.print("Enter OP :");
// String op =new Scanner(System.in).nextLine() ;
// int result=0;
// switch(op){

//     case "+": {result=x+y;break;}
//     case "-": {result=x-y;break;}
//     case "*": {result=x*y;break;}
//     case "/": {result=x/y;break;}
//     case "%": {result=x%y;break;}
//     default : {System.out.println("Enter OP !");break;}
// }

//    System.out.println("result = "+ result);
//     }
// }
//! 14. Loops
//! while
// class App{
//     public static void main(String[] R9)
//     {
//         int x = 1 ;
//         while(x<=5){System.out.println("Reda");
//     x++;
//     }
//     }
// }
//! do while
// class App{
//     public static void main(String[] R9)
//     {
//         int x = 1 ;
//         do{System.out.println("Reda");
//     x++;
//     }
//         while(x<=5);
//     }
// }
//! for loop
// class App{
//     public static void main(String[] R9)
//     {
//        for(int x=1 ; x<=5 ; x++){
//         System.out.println("Reda");
//        }
//     }
// }
//! 15. Nested Loops
//! Nested Loops "while"
// class App{
//     public static void main(String[] R10)
//     {
//         int x =1 ;
//        while(x<=10)
//        {
//         int y=1;
//         while(y<=10)
//         {
//             System.out.println(x+"*"+y+"="+x*y);
//             y++;
//         }
//         x++;
//        }
//     }
// }
//! Nested Loops "for"
// class App{
//     public static void main(String[] R9)
//     {
//        for(int x=1 ;x<=10; x++){
        
//         for(int y=1 ;y<=10; y++){
//        System.out.println(x+"*"+y+"="+x*y);
//        }
//        }
//     }
// }
//! 16. Degree Calculator برنامج تقييم الدرجات
// import java.util.Scanner;
// class App {
//     public static void main ( String [] R10)
//     {
//         while(true){
// System.out.print("Enter your Degree : ");
// int degree = new Scanner(System.in).nextInt();
// if(degree > 100 || degree < 0)
// {
//     System.out.println("Error");
//     break;/* راح يوكف اللوب لا نهائي*/
// }
// if (degree>=90){
//     if(degree>=95){System.out.println("+A");}
//     else {System.out.println("-A");}
//     }
// else if (degree>=80){System.out.println("B");}
// else if (degree>=70){System.out.println("C");}
// else if (degree>=60){System.out.println("D");}
// else if (degree>=50){System.out.println("E");}
// else {System.out.println("F");}
//     }
//     }
// }
//! 17. Control Statements التحكم بالعبارات التكرارية
//TODO :
// class App{
//     public static void main(String[] R11)
//     {
//        for(int x=1 ;x<=10; x++){
//               if(x==5){continue;} /* هنا راح يطبع كل الاعداد ما عدى الخمسة*/

//          System.out.println("x= "+ x);
         
//       /* if(x==5){break;}*//* هنا من راح يوصل للخمسة يوكف اللوب للخمسة*/   

//        }
//     }
// }
//TODO : 
// class App{
//     public static void main(String[] R9)
//     {
//         Reda: /* هنا نكدر نسمي اللوب سواء الداخلي او الخارجي*/
//        for(int x=1 ;x<=10; x++){
//         Emad :
//         for(int y=1 ;y<=10; y++){
//             if(x==6){break Reda ;}/* هنا كدر يوكف اللوب الخارجي من اللوب الداخلي*/
//         /*  if(x==6){continue Reda ;}*//* كذلك نفس السالفة*/
//        System.out.println(x+"*"+y+"="+x*y);
//        }
//        }
//     }
// }
//! 18. Exception الأستثناء
// import java.util.Scanner ;
// class App {
//     public static void main (String[] R12){
//         try{/* التراي تشغل الكود اذا بي خطأ يحول عل كاج */
//             /* يعني نفرض انو هنا دخلت قيمه مو انتجر راح يطلع ايرور بس ويا التراي والكاج راح ينفذ اكواد الكاج*/
// System.out.print("Enter your age : ");
// int age = new Scanner(System.in).nextInt();
// System.out.println("Your Age > "+ age + " <");
// }
// catch(Exception e ){/*الكاج تكدر تعتبره كود بديل */
//     System.out.println("Error !");
// }
//     }
// }
//TODO :
// import java.util.Scanner ;
// class App {
//     public static void main (String[] R12){
// while(true){
//     /* هنا سوينه لوب لا نهائي وبنهبه التراي خلينه بريك حتى يضل يشتغل البرنامج لحدما طبب القيم الصحيحة ويوكف*/
//         try{
// System.out.print("Enter your age : ");
// int age = new Scanner(System.in).nextInt();
// System.out.println("Your Age > "+ age + " <");
// break ; 
// }
// catch(Exception e ){
//     System.out.println("Error !");
// }}
//     }
// }
//TODO : 
// import java.util.InputMismatchException;
// import java.util.Scanner ;
// class App {
//     public static void main (String [] R12)
//     {
//         while(true){
//         try{
//         System.out.print("Enter num 1 : ");
// int x = new Scanner(System.in).nextInt();
// System.out.print("Enter num 2 : ");
// int y = new Scanner(System.in).nextInt();
// System.out.print("<"+ x/y + ">");
// break ;
//     } 
//     catch (InputMismatchException e){/*هذه الاستثناء يشتغل اذا دخل المستخدم قيمه خاطئة */
//         System.out.println("InputMismatchException");}
//         catch(ArithmeticException e){/* هذه الاستثناء يشتغل اذا دخل المستخدم قسمه عدد على صفر لأن تدري بالبرمجه ميصير هيج شي*/
//         System.out.println("Division by zero");}
//         /*ذن الاستثنائات تكدر تاخذهن من الايرور اللي يطلع بالتيرمنل*/
//     }}
// }
//! 19. Arrays
// class App {
//     public static void main (String[] R13){
//         int[] x = new int[3];//*  هيج نسوي مصفوفة*/
//         x[0]=77 ;
//         x[1]=67 ;
//         int z[] = new int[6];//*تكدر هيج تسوي*/
//         int[] y={23,34,45};//*طريقة ثانيه تسوي بيهة المصفوفه*/
//         int[]g ;//*هاي طريقة ثالثة مجزئئة عن الاولى هم تصير*/
//         g=new int[3];//*هذه جزئها الثاني */
//         char[] k={'a','b','c'};
//         for(int i=0 ; i< 3 ; i++)
//         {
// System.out.println(y[i]);}
//         for(int h=0 ; h< 3 ; h++){

// System.out.println(k[h]);
//         }
//         for(int h=0 ; h< k.length;  h++){//*هاي اليث تخلي يحسب طول المصفوفة */

// System.out.println(k[h]);
//         }
//         for (char c : k)//*تطوير للكود السابق */
//         {
//             /*السي مررنا بل كي وعرفنا كركتر المهم يعني ال كي يساوي سي */
//             System.out.println(c);
//         }
// for (var c : k)//*تطوير للكود السابق */
//         {
//             /*هنا خلينه الفار حتى مايحتاج تعرف المتغير */
//             System.out.println(c);
//         }

//         }
        
//     }
//! 20. Array of 2D
// public class App {
//     public static void main (String[] R14){
//         /*ملخص ال  Arrays ام الصف الواحد*/
//         String[] a = new String[5];
//         String[] b = {"a","b","c","d","e"};
//         String[] c = new String[]{"a","b","c","d","e"};
//         /* !المصفوفه الثنائية  */
//         int [][] x = new int[2][3];
//         x [0][0]= 2;
//         x [0][1]= 2;
//         x [0][2] = 2;
//         int [][] y = 
//         {
//             {1,2,3},
//             {4,5,6}
//         };
//         int [][] z = new int [][] {{1,2,3},{4,5,6}};
// System.out.println(y[1][1]);
// //!
// for (int i = 0 ; i<2 ; i++)//! للصفوف
// {
// for (int j = 0 ;j<3 ; j++)//! للاعمده
// {
// System.out.println(y[i][j]);
// }
// }
// //! اذا اجيت تستدعي هاي المصفوفه راح يصير عندك مشكله اذا بنفس الطريقة السابقة 
// int [][] h = 
//         {
//             {1,2,3},
//             {4,5}
//         };
//         for (int i = 0 ; i<y.length ; i++)//! عدد الصفوف
// {
// for (int j = 0 ;j<y[i].length ; j++)//! عدد الاعمده الموجوده بالصف الاول
// {
// System.out.println(h[i][j]);
// }
// }
// System.out.println("Stop ! ");
// //! كود مطور للفور اسمه فور ايجج
// for (int [] i : h )
// {
//     for ( int j : i ){
// System.out.println(j);

//     }
// }
//     }
// }
// ! 21. Array part 2
// import java.util.*;
// import java.util.Scanner ;
// public class App {
//     public static void main (String[] R14){
//         Scanner cin = new Scanner(System.in);
// var x = 6.7;
// /*لازم نحدد نوع الاريه */
// var a = new int [3];/*يصير هيج تعرف */
//  var b = {3,4,5};/*ما يصير هيج تعرف */
// var c = new int [] {3,4,5};/*يصير هيج تعرف */
// int q = c.length;/*هنا سوينه متغير ينحط بداخله حجم المصفوفة */
//  for (int i = 0, int s =  c.length; i < s; i++) {
//     المفروض يصير هيج سوي لأن الجزء الاول للتعريفات 
//  } 
// for (int i = 0 ; i < a.length; i++) {
//    a[i]= cin.nextInt();/*الادخال بالمصفوفة  */
// } 
// for (int j = 0 ; j < a.length; j++) {
//    System.out.println(a[j]);/*الاخراج بالمصفوفة  */
// } 
// /*شلون تعرف اكثر من مصفوفة بنفس الصطر */
// int [] d,b ;/*هيج  راح يصير كأنما ال اي و ال بي بنفس العناصر يعني مايصير تخزن بيهن ثنينهن */
// int l[],y[];/*هيج تكدر تعرف اكثر من مصفوفة طبيعي */
// d=new int [4];
// b=new int [4];/*مايصير بعد هيج يتخاربون */
// l=new int [4];
// y=new int [4];
//     }
// }
//! 22. ArrayList
// import java.util.ArrayList;
// import java.util.*;
// import java.util.Scanner ;
// public class App {
//     public static void main (String[] argc){
//         Scanner cin = new Scanner(System.in);
// /*الفرق بين الاريه والاريه لست انو نكدر نعدل عليهة  */
// /* <int> (5) هيج الهيكلة مالتهة */
//  ArrayList<int> y = new ArrayList<int>(5);
// ArrayList z = new ArrayList(99);/*ال 5 هي القيمة الابتدا~ية للست  */
//  var x = new ArrayList<int>();
// var x = new ArrayList();
// x.add("A");/*تتدخل للست */
// x.add("B");
// x.add("C");
// x.add(0,"E");/*هنا راح يضيف النص للاندكس اللي اختاريته  */
// x.remove("B");/*تحذف من اللست */
// x.set(1,"D");/*السيت تشيل من واحد من الاندكسات وتبدله باشي الاريده *//*X[1]="D" */
// System.out.println(x);
// System.out.println(x.size());/*تنطي حجم اللست */
// System.out.println(x.get(0));/*x[0] هنا يكلي اجلب العنصر بالاندكس */
//     System.out.println(x.isEmpty());/*هنا جاي يسأل هل الست فارغة ؟ والجواب يكون يا اما ترو او فولس */
// System.out.println(x.contains("A"));/*هنا يسأل هل العنصر اي موجود لو لا؟  */
// System.out.println(x.indexOf("A"));/* هنا يجاوبني وين الاندكس مالت الاي*/
// System.out.println(x.lastIndexOf("A"));/*هنا يكلة انطيني اخر مكان لحرف الاي يفيد اذا عندك اكثر من اي فينطيك اخر اي*/
// x.clear();/*يمسح جميع العناصر بلمصفوفة  */
// }
// }
//! 23. String Methods
// public class App {
//     public static void main (String [] argc){
//         String Name = "Reda Emad Hassen" ;
// System.out.println(Name.length());/* يجلب طول المصفوفة*/
// System.out.println(Name.charAt(1));/* يعطني الرمز اللي بالاندكس*/
// System.out.println(Name.contains("R"));/* هل هذه السلسلة تحتوي على هذا الحرف*/
// System.out.println(Name.indexOf('E'));/*ينطي مكان الاندكس اللي بي الحرف */
// System.out.println(Name.lastIndexOf('R'));/* ينطيك اخر مكان بي هذا الحرف*/
// System.out.println(Name.equals("Emad"));/* هل الكلمة تساوي الاسم؟*/
// System.out.println(Name.compareTo("Hassen"));/*قارن يعني ينقص طول المصفوفة من الاسم المذكور وينطيك الناتج */
// System.out.println(Name.isEmpty());/* هل المتغير فارغ ؟ */
// System.out.println(Name.substring(7));/* راح ينطيني الكلمة ويحذف اول سبع احرف*/
// System.out.println(Name.toLowerCase());/* يعني يحولهة اله حروف صغيره */
// System.out.println(Name.toUpperCase());/*يعني يحولهة حروف كبيره*/
// System.out.println(Name.concat(" HI"));/* هنا يضيف كلمه ويا الكلمة*/
// System.out.println(Name.replaceFirst("R", "N"));/* هنا يبدل بس اول حرف او كلمة يلكا*/
// System.out.println(Name.replace("R", "N"));/*هنا تستبدل كل حرف او كلمة */
// char[] a = Name.toCharArray(); /*يحول الكلمة لمصفوفة */
// System.out.println(a);
// System.out.println(a[0]);
// //! StringBuffer
// StringBuffer s = new StringBuffer("abcd");
// StringBuffer g = new StringBuffer(9);/*تحديد سعه الكاباستي */
// g.append("gg");
// System.out.println(s.reverse());/* تعكس الكلمة*/
// System.out.println(s.append("e"));/* تضيف للكلمة*/
// System.out.println(g.capacity());/* السعة : يعني ينطي حجم السعة وينطيك كل واحد 20*/
// System.out.println(s.length());/* طول المصفوفة*/
// System.out.println(s.deleteCharAt(0));/* تحذف رمز معين با اندكس معين*/
// System.out.println(s.delete(0, 3));/* يحذف رينج يعني من الصفر لل ثلاثة*/
// System.out.println(s.insert(0, "dcba"));/*تضيف بانديكس مخصص  */
//     }
// }
//!24. Functions
// public class App {
//     public static void main (String [] args){
//         int s = g(3,9);
//         int x=4,y=6 ;
//          System.out.println(s); 
//          System.out.println( g(3,9));
//          sum(4,5);
//          sum(x, y);
//     }
//     public static void sum (int x , int y){
//         System.out.println(x+y);
//     }
//     public static int g (int x , int y) {
//        return x+y ;
//     }
// }
//! 25. Passing Array through Functions
// import java.util.Scanner;
// public class App {
//     public static void main (String [] args){
//        int [] x = new int[5];
//        int [] b = new int[5];
//        input(x);
//        output(x);
//        input(b);
//        output(b);
//     }
//     public static void input(int[] x){
        
//         Scanner cin = new Scanner(System.in);
// System.out.println (" Enter Elemnt : ");
// for (int i = 0 ; i<x.length ; i++)
// {
//     x[i]=cin.nextInt();
// }

// }
//      public static void output(int[] x){
// for (int i = 0 ; i<x.length ; i++)
// {
//    System.out.print(x[i]+"");
// }
//     }
// }
//! Array list func
// import java.util.ArrayList;
// import java.util.Scanner;
// public class App {
//     public static void main (String [] args){
//      var a = new ArrayList(4);
//      var b = new ArrayList(4);
//         input(a,4);/*a : size = 0 */
//        output(a);
//     }
//         public static void input(ArrayList x,int size){
        
//         Scanner cin = new Scanner(System.in);
// System.out.println (" Enter Elemnt : ");
// for (int i = 0 ; i<size ; i++)
// {
//     x.add(cin.nextInt());
// }

// }
//      public static void output(ArrayList x){
// for (int i = 0 ; i<x.size() ; i++)
// {
//    System.out.print(x.get(i)+"");
// }
// }}
//!  26. Recursion
// import java.util.Scanner;
// public class App {
//     public static void main (String [] args){
//        System.out.print(add(5));/*5+4+3+2+1+0*/
//     }
// public static int add(int a){
//        if(a !=0)
//        return a+add(a-1);/*5+4+3+2+1+0*//*تعيد استدعاء نفسهة */
//        else 
//        return 0 ;
//     }
// }
//!27. Math Library
// import java.util.Scanner;
// public class App {
//     public static void main (String [] args){
//      System.out.println("max(3,8)= "+Math.max(3,8));/*اكبر عدد*/
//      System.out.println("min(6,4)= "+Math.min(6,4));/*اصغر عدد */
//      System.out.println("sqrt(9)= "+Math.sqrt(9));/*الجذر التربيعي */
//      System.out.println("pow(4,9)= "+Math.pow(4,9));/*  هنا 4 اس 9*/
//      System.out.println("abs(-9)= "+Math.abs(-9));/* القمة المطلقة*/
//      System.out.println("log(10)= "+Math.log(10));/* ln هنا*/
//      System.out.println("log1p(9)= "+Math.log1p(9));/* log زائد واحد */
//      System.out.println("log10(10)= "+Math.log10(10));/* log */
//      System.out.println("exp(1)= "+Math.exp(1));/* e اس واحد*/
//      System.out.println("expm1(1)= "+Math.expm1(1));/* تنطي قيمة الاي اس واحد ناقص واحد*/
//      //! الدوال المثلثية
//      System.out.println("sin(30)= "+Math.sin(Math.toRadians(30)));/* */
//      System.out.println("cos(60)= "+Math.cos(Math.toRadians(60)));/* */
//      System.out.println("tan(45)= "+Math.tan(Math.toRadians(45)));/* */
//      System.out.println("asin(0.5)= "+Math.asin(Math.asin(0.5)));/* تعكس عمليه الساين و الكوساين و التاين*/
//      System.out.println("acos(0.5)= "+Math.acos(Math.asin(0.5)));/* */
//      System.out.println("atan(1)= "+Math.atan(Math.asin(1)));/* */
//      //! دوال التقريب
//      System.out.println("round(2.1)= "+Math.round(2.1));/* */
//      System.out.println("round(2.9)= "+Math.round(2.9));/* */
//      System.out.println("ceil(2.9)= "+Math.ceil(2.9));/*تقرب الى اقرب اكبر عدد صحيح */
//      System.out.println("ceil(2.1)= "+Math.ceil(2.1));/* */
//      System.out.println("floor(2.1)= "+Math.floor(2.1));/* دائما تقرب الى اصغر عدد*/
//      System.out.println("floor(2.9)= "+Math.floor(2.9));/* */
//     }

// }
//! 28. Max Value
// import java.util.Scanner;
// public class App {
//     public static void main (String [] args){
// sizenum();
// max(5,6,4,3,4,new Scanner(System.in).nextDouble());/* هنا اخر شي خليت المستخدم يدخل اخر قيمة */

//     }
// public static void max (double... num)/*هنا اكدر ادخل اعداد لا محددوده يعني تقريبا تصير مصفوفة اكدر استخدم دوال المصفوفة واكدر استدعيهن عن طريق الاندكس*/
// {
// if(num.length == 0){
// System.out.println("No value");
// return ;}
// double result = num[0];
// for(int i = 1 ; i<num.length;i++)/*بديت من الواحد لأن مخزن الصفر بلريزولت */
// {
// if(num[i] > result){
//     result=num[i];
//     }
// }
// System.out.println("Maximum Value is : " +result);
// }
// public static void sizenum (){
// System.out.print("How many num :");
// int size = new Scanner(System.in).nextInt();
// double [] x = new double[size];
// for(int i = 0 ; i<x.length;i++)
// {
//     System.out.print("Enter value of "+ (i+1) + " : ");
//     x[i]=new Scanner(System.in).nextDouble();
// }
//     max(x);
// }
// }
//!29. Introduction
/*
object oriented programming (oop)

opject :

Attributes = Variable
var heirColor:string="Black"

Actions = Function
Thinking(){

}
 */
//! 30. Class and Objects
// import java.util.Scanner;
// class App {
// public static void main (String [] args){
// var r1 = new Human();/*خزنت داخل ال ار اوبجكت كامل */
// r1.name="Reda";
// r1.gender="Male";
// r1.length=4;
// r1.newLength();
// System.out.println(r1.name);
// System.out.println(r1.gender);
// System.out.println(r1.length);
// var r2 = new Human();
// r2.name=new Scanner(System.in).nextLine();
// r2.gender=new Scanner(System.in).nextLine();
// r2.length=new Scanner(System.in).nextInt();
// r2.newLength();
//     }
//     }
// class Human {
//     String name ;
//     String gender;
//     int length ; 
//     public void newLength(){
//         this.length+=10; /* الذس بمعنى هذه الاوبجكت اللي استدعه الداله يعني الار 1 زود عليه 10*/
//      /* length+=10;*/ /* هيج خطأ*/
//      System.out.println("My Name is : "+ this.name);
//      System.out.println("My Length is : "+this.length );
//      System.out.println("My Gender is : "+this.gender );
//     }
// }
//! 31. Constructors
// class App {
//     public static void main(String[] argc){
//         var r1  = new Human(5);
//     }
// }
// class Human{
//     int age ; 
//     /*الكونكسراكتر ينفذ في حان استدعاء الاوبجكت */
// Human(int a){
//     this.age = a;
//     System.out.print("Age=" + this.age);
// }


// }
//! استدعاء الفاكشن يتأثر بلبراميترات
// class App {
//     public static void main(String[] argc){
//         var r1  = new Human();
//         r1.Sum(3,5);/*هنا راح يروح على الفاكشن مال الانتجر */
//         r1.Sum(3,8.5);/*هنا راح يروح على مالت الدوبل  */
//         r1.Sum(4,6,5);/*هنا راح يروح على ثالث وحده لأن انا خال ثلاثة مدخلات */
//     }
// }
// class Human{
// /*هنا اذا خليت الاعداد انتجر راح يجي على هاي الميثود */
//     public void Sum(int a , int b ){
// System.out.println("sum = " + a+b);
//    }
//    /*هنا اذا كتبت الاعداد دبل راح يجي على هذه الميثود */
//    public void Sum(int a , double b ){
// System.out.println("sum = " + a+b);
//    }
// public void Sum(int a , int b , int c){
// System.out.println("sum = " + (a+b+c));
//    }
// }
//! نرجع على الكونسراكتر
// class App {
//     public static void main(String[] argc){
//         /*هنا هم نفس سالفة الفاكشن يعني يتأثر الكونستراكتر بل بريمتر */
//         var r1  = new Human(4,6,4);

//     }
// }
// class Human{
//    Human(int a , int b ){
// System.out.println("sum= " + a+b);
//    }
//   Human(int a , double b ){
// System.out.println("sum= " + a+b);
//    }
// Human(int a , int b , int c){
// System.out.println("sum= " + (a+b+c));
//    }
// }
//! 32. Inheritance - الوراثة
// class App {
//     public static void main(String[] argc){
// var a =  new A();
// a.myAge();
// var b = new B() ; 
// b.myAge();
// var c = new C();
// c.myAge();
// b.info();
//     }
// }
// class A {/*indirect subper class يسمو */
//     int age ; 
//     public void myAge(){
//         this.age=20;
//         System.out.println("Age = "+ this.age);
//     }
// }
// class B extends A{/*dipect super class*/
//     int length;
//     public void info(){
//         this.length=170;
//         super.age=50;/*هنا راح ياخذ المتغير اللي بالسوبر فوك ويعدل علية */
//          System.out.println("Age = "+ this.age+ " length = "+ length);
//     }
// }
// class C extends B {/*subclass */
    
// }
//! 33. Super Constructor
// class App {
//     public static void main(String[] argc){
//        var c = new C(4);
//     }
// }
// class A {
//     A(int up){
// System.out.println("N = "+ up);    
// System.out.println("A");
//     }
// }
// class B extends A {
//      B(int upA){
//         super(upA);/*راح اصعد المتغير للاي */
//         System.out.println("B");
//     }
// }
// class C extends B{
//      C(int upB){
//         super(upB);/*راح اصعد للبي */
//         System.out.println("C");
//     }
// }
//! 34. Override - يطبق بس بالوراثة
// class App {
//     public static void main(String[] argc){
// var csum = new Op();
// csum.sum(3,5);/*راح لاول داله */
// csum.sum(3,5.8);/* نزل للدوبل*/
//     }
// }
// class Sum {
//     public void sum (int x,int y){
// System.out.println(x+"+"+y+"="+(x+y));
//     }
// }
// class Op extends Sum {
//     public void sum (int x,double y){
// System.out.println(x+"+"+y+"="+(x+y));
//     }
// }
//! @Override - استخدام <
// class App {
//     public static void main(String[] argc){
// var csum = new Op();
// csum.sum(3,5);
// var s = new Sum();
// s.sum(3,4);
//     }
// }
// class Sum {
//     public void sum (int x,int y){
// System.out.println(x+"+"+y+"="+(x+y));
//     }
// }
// class Op extends Sum {
//     @Override /*تعدل على الداله الموجوده بلسوبر */
//     public void sum (int x,int y){
// System.out.println("Sum = "+(x+y));
//     }
// }
//! 35. Access Modifier
// class App {
//     public static void main(String[] argc){
//        var a = new A();
//        a.x1=10; 
//     /*a.x3=10;*/ 
//     /* a.x2=10; */ /*خطأ */
//     }
// }
// class  A {
//     public int x1 ; // عام /* نكدر نوصلة من اي مكان */
//     private int x2 ;// خاص /* ما نكدر نوصله اله بداخل الكبلاس نفسه*/
//     protected int x3 ;// محمي /* نوصله من الكلاسات الوارثه منه*/
// }
// class B  extends A {
// public void info(){
//     super.x3=10;
// }
// }
//! 36. Nested Class
// class App {
//     public static void main(String[] argc){
//        var a = new A();
//       /*  A.B b = a.new B(); */
//        var b = new A.B();
//        a.info2();
//        b.info();
//        A.info2(); /*هاي لأن ستاتك استدعيتهة كبل */
//     }
// }
// class  A {
//    public static void info2(){
//     System.out.println("A");
//    }
//    /*اذا تخلي ستاتك للكلاس تكدر تستدعي بالطريقتين الطبيعيتين
//     * var b = new A.B();
//     * A.B b = new A.B();
//     */
//   static  class  B {
//    public void info(){
//     System.out.println("B");
//     info2(); /*هنا استدعيت الفاكشن بلكلاس الاول بس خليتهة ستاتك */
//    }
// }
// }
//! 36. Nested Class in function
// class App {
//     public static void main(String[] argc){
// myFun();
//     }
//     public static void myFun(){
//       class  B {
//    public void info(){
//     System.out.println("B");
//    }  
// }
//    var b = new B ();
//    b.info();
//     }
// }
//! 37. Exceptions - الاستثناء 
// class App {
//     public static void main(String[] argc){
// info(5);
//     }
//    public static void info(int x){
//     var ex = new Exception();
//     try{
//         if(x==5){
//             throw ex ;/*هنا يرمي للكاج */
//         }
//             System.out.println("Number = "+ x);
//         }
//         catch(Exception e){
//             System.out.println(e);/*راح يطبع نوع الخطأ */
//         }
//     }

//    }

//!  Exceptions اسلوب ثاني
// class App {
//     public static void main(String[] argc){
//         try{
// info(5);}
//         catch(Exception e){
//             System.out.println(e);/*راح يطبع نوع الخطأ */
//         }
//     }
//    public static void info(int x) throws Exception {
//     var ex = new Exception();
//         if(x==5){throw ex;}
//             System.out.println("Number = "+ x);
//         }
//     }
//!  Exceptions داخل كلاس
// class App {
//     public static void main(String[] argc){
//         var a = new A();
//         try{
//      a.info(5);
// }
//         catch(Exception e){
//             System.out.println(e);/*راح يطبع نوع الخطأ */
//         }
//     }
   
//     }
//     class A {
//         public static void info(int x) throws Exception {
//     var ex = new Exception();
//         if(x==5){throw ex;}
//             System.out.println("Number = "+ x);
//         }
//     }
//! 38. Polymorphism متعدد الاشكال
// class App {
//     public static void main(String[] argc){
//         var s = new Shape();
//         s.shape();
//         var c = new Circle();
//         c.shape();
//         var r = new Rectangle();
//         r.shape();
//         var s1 = new Shape();
//         /*انشاء مصفوفة من الكلاس */
//         /*هنا يطبق ال Polymorphism  */
//         Shape[] a = new Shape[4];
//         a[0] = new Shape();
//         a[1] = new Circle();
//         a[2] = new Rectangle();
//         a[3] = s1;
//         a[0].shape(); /*طريقة الاستدعاء  */
//         a[1].shape();
//         a[2].shape();
//         a[3].shape();
//         for (int i = 0; i <a.length; i++) {
//             a[i].shape();
//         }
//         /*or*/
//         for(var vare : a)
//         {
//             vare.shape();
//         }
//     }
// }
// class Shape{
//     public void shape(){
//         System.out.println("Shape");
//     }
// }
// class Circle extends Shape{
//     @Override
//     public void shape(){
//         System.out.println("Circle");
//     }
// }
// class Rectangle extends Shape{
//     @Override
//     public void shape(){
//         System.out.println("Rectangle");
//     }
// }
//! . Polymorphism  Example 2
// class App {
//     public static void main(String[] argc){
//         var a = new A();
//         a.draw(new Shape());
//         a.draw(new  Circle());
//         a.draw(new Rectangle());
//     }
// }
// class A {
//     public void draw(Shape s)
//     {
//         s.shape();
//     }
// }
// class Shape{
//     public void shape(){
//         System.out.println("Shape");
//     }
// }
// class Circle extends Shape{
//     @Override
//     public void shape(){
//         System.out.println("Circle");
//     }
// }
// class Rectangle extends Shape{
//     @Override
//     public void shape(){
//         System.out.println("Rectangle");
//     }
// }
//! . 39. Abstract
/*الابستراكت ماتكدر تنشء اوبجكت منه */
// class App {
//     public static void main(String[] argc){
//  var c = new Circle();
// c.info();
// X s = new X();
// s.info();
//     }
// }

// abstract class Shape {
//     abstract public void info();
// }
// class Circle extends Shape{
//     @Override
//     public void info(){
//         System.out.println("Circle");
//     }
// }
// class X extends Shape{
//     @Override
//         public void info(){
//         System.out.println("Ci");}
//     }
//!  interface الانتر في يعمل عمل الابستراكت
// class App {
//     public static void main(String[] argc){
//         var c = new Circle();
//         c.info();
//     }
// }
// /*الانتر فيس تفيد بالوراثه المتعدده */
// interface Shape {
//     abstract public void info();
// }
// class Circle implements Shape{
//     @Override
//     public void info(){
//         System.out.println("Circle");
//     }
// }
//!  40. Multi Inheritance الوراثة المتعدده
// class App {
//     public static void main(String[] argc){
//         var op = new Operations();
//         op.sum(5, 6);
//         op.sub(2,7);
//     }
// }
// /*نستخدم الانتر فيس حتى يدعم الوراثه المتعدده */
// interface Sum{
//     public  void sum(int a , int b);
// }
// interface Sub{
//     public  void sub(int a , int b);
// }
// /*الانتر في تكدر تخليك تورث من كلاسين من نوع انتر فيس */
// class Operations implements Sum,Sub {
//     @Override
//     public void sum(int a, int b) {
//         System.out.println("Sum = "+(a+b));
//     }
//     @Override
//     public void sub(int a, int b) {
//         System.out.println("Sub = "+(a-b));
//     }
// }
//! نكدر نخلي انتر فيس يرث من انتر فيس
//!بس الانتر فيس مايرث من كلاس عادي
// class App {
//     public static void main(String[] argc){
//         var op = new Operations();
//         op.sum(5, 6);
//         op.sub(2,7);
//     }
// }
// /*نستخدم الانتر فيس حتى يدعم الوراثه المتعدده */
// interface Sum{
//     public  void sum(int a , int b);
// }
// interface Sub extends Sum {
//     public  void sub(int a , int b);
// }
// /*الانتر في تكدر تخليك تورث من كلاسين من نوع انتر فيس */
// class Operations implements Sub {
//     @Override
//     public void sum(int a, int b) {
//         System.out.println("Sum = "+(a+b));
//     }
//     @Override
//     public void sub(int a, int b) {
//         System.out.println("Sub = "+(a-b));
//     }
// }
//! 41. Anonymous الكلاس المجهول او الكلاس الوهمي
// class App {
//     public static void main(String[] argc){
//         /*Anonymous class  */
//        var x = new A (){
//         @Override
//         public void info(){
//             System.out.println("x");
//         }
//        };
//        x.info();
//        var p = new Poly();
//        p.poly(x);
//        /*or*/
//         p.poly(new A (){
//         @Override
//         public void info(){
//             System.out.println("Px");
//         }
//        }
//        );
//     }
// }
// class Poly {
//     public void poly(A a){
//         a.info();
//     }
// }
// abstract class A {
// abstract public void info();
// }
//! 42. Lambda
// class App {
//     public static void main(String[] argc){
        
//        Demo d = new Demo(){
//         /*Anonymous*/
//         @Override
//         public  void sum(int a, int b)
//         {
// System.out.println("Sum 1 = "+(a+b));
//         }
        
//        };
//        d.sum(4,9);
//        /*طريقة مختصره للامدا اكسبرشن */
//        Demo d2 = (int a, int b)->{System.out.println("Sum 2 = "+(a+b));};
//        d2.sum(3,7);
//        Demo d3 = App::info;
//        d3.sum(2,5);
//         }
//         private static void info(int a , int b){
// System.out.println("Sum 3 = "+(a+b));
//         }
//     }
//     interface Demo{
//         void sum(int a , int b);
//     }
//! . Lambda 
// import java.util.*;
// import java.util.ArrayList;
// class App {
//     public static void main(String[] argc){
//       var x = new ArrayList<Integer>();
//         x.add(4);
//         x.add(5);
//         x.forEach(
//             /*اكدر اشيل التعريف هنابدون ايرور */
//             /*واكدر احذف الاقواس */
//             (var i)-> {
// System.out.print("Item = ");
// System.out.print(i+" , ");
//             }
            
//         );
//       /*اختصار كبير للفوك كله بس بسطر واحد */
//         x.forEach(System.out::println);
//     }
// }
//! 43. Multi Threading - المعالجات المتوازية
/*تفيد بتنفيذ الداله بنفس اللحظة يعني يشغل فاكشننين بنفس اللحظة */
// class App {
//     public static void main(String[] argc){
//            var h =new Hello();
//            var w = new World();
//            /*الستارت موجود داخل الثريدس وضيفتهة تعمل مع الداله ران يعني جاي تكل الكومبايلر بدء التشغيل يعني بدء الداله ران */
//             h.start();
//             w.start(); 
           
             
//     }
// }
// class Hello extends Thread{
//     @Override
//     /*هاي الران مو عاديه هاي موجوده داخل الثريجس وداخل الثريدس موجود رانبل وداخله تلكه الران */
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello ");
//             try {
//                 Thread.sleep(500); /*هنا راح ينتضر نص ثانية */
//             }
//             catch (InterruptedException e ) {
//                 e.printStackTrace();
//             };
//         }
//     }
// }
// class World extends Thread {
// @Override
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("World");
//             try {
//                 Thread.sleep(500);
//             }
//             catch (InterruptedException e ) {
//                 e.printStackTrace();
//             };
//         }
//     }
// }
//! . Multi Threading - المعالجات المتوازية
// class App {
//     public static void main(String[] argc){
//            var h =new Hello();
//            var w = new World();
//            var t1 = new Thread(h);
//            var t2 = new Thread(w);
//            var t3 = new Thread(new Hello());
//            var t4 = new Thread(new World());
//             t1.start();
//             t2.start();
//             t3.start();
//             t4.start();
//             //
//              var t5 = new Thread(new Runnable(){
//             @Override
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello ");
//             try {
//                 Thread.sleep(500); /*هنا راح ينتضر نص ثانية */
//             }
//             catch (InterruptedException e ) {
//                 e.printStackTrace();
//             };
//         }
//     }
//            });
//            var t6 = new Thread(new Runnable(){
//             @Override
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("World");
//             try {
//                 Thread.sleep(500); /*هنا راح ينتضر نص ثانية */
//             }
//             catch (InterruptedException e ) {
//                 e.printStackTrace();
//             };
//         }
//     }
//            });
//            t5.start();
//             t6.start();
           
//     }
// }
// class Hello implements Runnable{
//     @Override
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello ");
//             try {
//                 Thread.sleep(500); /*هنا راح ينتضر نص ثانية */
//             }
//             catch (InterruptedException e ) {
//                 e.printStackTrace();
//             };
//         }
//     }
// }
// class World implements Runnable {
//     @Override
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("World");
//             try {
//                 Thread.sleep(500);
//             }
//             catch (InterruptedException e ) {
//                 e.printStackTrace();
//             };
//         }
//     }
// }
//! 44. Generic 
// class App {
//     public static void main(String[] argc){
//         /*هنا انا اكدر اتحكم بنوع المتغير  */
// var b1 = new B<Integer,Boolean>();
// b1.x = 15 ; 
// b1.y= false ;
// b1.test(b1.x, b1.y);
// /*هنا صار عدنه الاكس دوبل و الواي انتجر */
// var b2 = new B<Double,Integer>();
// b2.x = 2.4 ; 
// b2.y = 2 ;
// b2.info(b2.y);
//     }
// }
// /**
//  * B
//  */
// /*هنا سوينه شلون البرميتر اللي بلفاكشن بس هنا بلكلاس و للتحم بنوع المتغيرات */
//  class B <T , E>{
// T x ;
// E y ;
// /*يصير نسوي نفس الشي للفاكشن */
// public void test(T a , E b){}
// /*نكدر هم نسوي فاكشن يرجع قيمه هذه النوع من المتغير */
//     public E info (E a){
//         return a ;
//     }
// }
//! 45. Enum class
// import java.util.Scanner;
// class App {
//     public static void main(String[] args){
/*System.out.println(Direction.North);*/
// Direction.North.getDir();
// Direction.South.getDir();
// System.out.println(Direction.North.i);
// System.out.println(Direction.North.s);
// /*تظهر الثوابت */
// var x  = Direction.values();
// System.out.println(x[0]);
// for(var i : x){
//     System.out.print(i.i);
//      System.out.println(i);
// }

// Direction.North.getDir();
// /*اكدر استفاد من الفاليو اوف انو اخلي المستخدم يدخل قيمه الفاليو */
// Direction.valueOf("North");
// var y = Direction.valueOf(new Scanner(System.in).nextLine());
// switch (y) {
//     case North:
        
//         break;
// case South:
        
//         break;
//         case West:
        
//         break;
//         case East:
        
//         break;
//     default:
//         break;
// }
//     }
// }
// enum Direction{
//     North(1,"North"){
//         @Override
//         void getDir(){
// System.out.println("North");
//         }
//     },
//     South(2 , "South"){
//         @Override
//         void getDir(){
// System.out.println("South");
//         }
//     },
//     West(3,"West"){
//         @Override
//         void getDir(){
// System.out.println("West");
//         }
//     },
//     East (4,"East"){
//         @Override
//         void getDir(){
// System.out.println("East");
//         }
//     };
//     /*اي متغير هو تابع لكل الثوابت الموجوده فوك */
//     int i ;
//     String s ;
//     /*الثوابت الفوك ياخذن المتغيرات اللي بلكونستراكتر */
//     Direction(int P_i, String P_s){
//         i=P_i;
//         s=P_s;
//     }
//    abstract void getDir();
// }
//! 46. Objects
// package اسم البكج 
/*البكج يفيد تخلي بي مجموعة من الفايلات والبكج هو ملف تسوي */
// import.packeg.classname;
// class App {
//     public static void main(String[] args){
// var x = new X();
// x.i=10;
// var y = new Y();
// y.casting().i=10;
//     }
// }
// class X{
//     int i ;
// }
// class Y {
//     public X casting(){
//         var x = new X();
//         return x;
//     }
// }