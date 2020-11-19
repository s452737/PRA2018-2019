package second.shortcuts;

import java.util.List;

public class ClassThatHaveItAll implements InterfaceOne {

    List<Long> list;

    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ClassThatHaveItAll.class);
    String name;
    Integer number;



    public void printMe(String info) {
        logger.info(info);
    }

    public void usageOfPrint() {
        printMe("Hi");
    }
}
