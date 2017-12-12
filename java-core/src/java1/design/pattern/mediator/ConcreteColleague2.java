package java1.design.pattern.mediator;

/**
 * @Author zhaojw
 * @Date 2017/12/12 22:49
 */
public class ConcreteColleague2  extends Colleague{

    public ConcreteColleague2(Mediator mediator){
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifyMessage(String message){
        System.out.println("同事2得到消息："+message);
    }
}
