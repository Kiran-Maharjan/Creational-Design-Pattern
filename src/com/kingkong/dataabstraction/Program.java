/*
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable
to the situation. The basic form of object creation could result in design problems 
or in added complexity to the design. Creational design patterns solve this problem 
by somehow controlling this object creation.

Creational design patterns are composed of two dominant ideas. One is encapsulating 
knowledge about which concrete classes the system uses. Another is hiding how instances of these concrete classes are created and combined.[1]

-helps to create object on the flight
*/


/*
** *****************kiranmaharjan8888@gmail.com

 */
package com.kingkong.dataabstraction;

import com.kingkong.dataabstraction.command.AddCommand;
import com.kingkong.dataabstraction.command.MathCommand;
import com.kingkong.dataabstraction.command.MathCommandFactory;
import com.kingkong.dataabstraction.command.SubCommand;

/**
 *
 * @author kiran
 */
public class Program {

    public static void main(String[] args) {

        double x = 2, y = 3;
        MathCommand cmd=MathCommandFactory.get("+");
        if(cmd!=null){
        System.out.println(cmd.calculate(x, y));
        }else
        {
            System.out.println("Command not found");
        }
    }
}
