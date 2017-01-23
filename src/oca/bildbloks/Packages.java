package oca.bildbloks;
//1. Correct, Class name or a wild card *.

import java.util.concurrent.AbstractExecutorService;  //Import of a class
import java.util.concurrent.*;  // But Don't Work on Subdirictories
import java.nio.*;              // NO GOOD – a wildcard only matches
                                //class names, not "file.*Files"
import java.util.Collections;

//2. Wrong
//2.1  Package name
//import java.util; Wrong
//2.2 import a method
//import java.util.Arrays.rangeCheck;
//2.3 Multiple wild cards
//import java.nio.*.*; // NO GOOD – you can only have one wildcard
//and it must be at the end

//3. Static import .Correct static import.
//3.1 Import of a method
import static java.util.Arrays.sort;
import static java.util.Arrays.copyOf;
//3.2 Constant
import static java.lang.Math.PI;
//3.3 Static import multiple methods with wild card
import static java.lang.Math.*;
//3.4 wrong order
//static import java.lang.System.out;
//3.5 Wrong. you cannot import a regular class
//import static java.util.Arrays;
//3.6 Import inner static class
import static oca.bildbloks.Packages.*;
import static oca.bildbloks.Packages.InnerClass;
import static oca.bildbloks.Packages.InnerClass.*;
import static oca.bildbloks.Packages.InnerClass.innerMethod;

//4. Conflicts
//import java.util.Date;
//import java.sql.Date;

import java.util.*;
import java.sql.*; // DOES NOT COMPILE ???
//4.1 Resolving conflicts
import java.util.Date; //Direct import take precendence over a wild card
import java.sql.*;
//4.2 If you do you need two classes with the same name.
// Look Conflits


/*
    Redunduntant import - influance on compile time(I don't know  how much). But in the result in will be
    the same *.java fire
 */

/**
 * Created by Serg on 9/15/2016.
 */
public class Packages {
    public static class InnerClass{
        public static void innerMethod(){
        };
    }
    //4.2
    public void Conflits(){
        Date date;
        java.sql.Date sqlDate;
        //Or
        //java.util.Date date;
        //java.sql.Date sqlDate;
    }
}
