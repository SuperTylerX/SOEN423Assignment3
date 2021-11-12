package publisher;

import service.AdminServiceImpl;
import service.StudentServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {

    public Server(int portNum, String campusCode) {

        String adminServicePath = "/AdminService";
        String studentServicePath = "/StudentService";
        String BASE_URI = "http://localhost:" + portNum;

        AdminServiceImpl adminService = new AdminServiceImpl();
        adminService.campusCode = campusCode;

        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.campusCode = campusCode;

        Endpoint.publish(BASE_URI + adminServicePath, adminService);
        Endpoint.publish(BASE_URI + studentServicePath, studentService);

        System.out.println("SOAP Service listening on " + BASE_URI + adminServicePath + "?wsdl");
        System.out.println("SOAP Service listening on " + BASE_URI + studentServicePath + "?wsdl");
        System.out.println(campusCode + " server is running ...");

    }


}
