package test;

public class CellphoneMmsSender {
    private CellphoneMmsSender cellPhoneService;

    public CellphoneMmsSender(CellphoneMmsSender cellPhoneService) {
        this.cellPhoneService = cellPhoneService;
    }

    public void send(String msg) {
        cellPhoneService.send(msg);
    }
}

//public class CellPhoneService {
//
//    public CellPhoneService() {
//
//    }
//
//    public void sendMMS(String mmg) {
//        System.out.println("send msg : "+ mmg);
//    }
//
//
//}