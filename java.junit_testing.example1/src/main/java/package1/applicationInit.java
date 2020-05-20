package package1;

import package1.controller.Calculating;
import package1.controller.EasyMessage;

public class applicationInit {
    public static void main(String[] args) {

        EasyMessage message = new EasyMessage(); // Init Custom Output Message
        message.Output("JUnit Laboratory № 1!");
        Calculating calcul = new Calculating();

        int iNumFirst = 15;
        int iNumSecond = 2;

        calcul.add(iNumFirst, iNumSecond);
        message.Output("Info Output: " + iNumFirst + " + " + iNumSecond + " = " + calcul.getResultAutoClean());

        calcul.div(iNumFirst, iNumSecond);
        message.Output("Info Output: " + iNumFirst + " / " + iNumSecond + " = " + calcul.getResultAutoClean());

        calcul.mult(iNumFirst, iNumSecond);
        message.Output("Info Output: " + iNumFirst + " * " + iNumSecond + " = " + calcul.getResultAutoClean());

        calcul.sub(iNumFirst, iNumSecond);
        message.Output("Info Output: " + iNumFirst + " - " + iNumSecond + " = " + calcul.getResultAutoClean());

        calcul.sqrt(iNumFirst);
        message.Output("Info Output: sqrt = " + calcul.getResultAutoClean());

        calcul.pow(iNumFirst, iNumSecond);
        message.Output("Info Output: pow = " + calcul.getResultAutoClean());
    }
}