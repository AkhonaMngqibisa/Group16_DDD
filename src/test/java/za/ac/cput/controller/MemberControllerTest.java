package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Member;
import za.ac.cput.factory.MemberFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class MemberControllerTest {

private static Member member = MemberFactory.createMember("Akhona","Mngqibisa","Ny1 No135 Gugulethu","0621982196",22,"Active","amngq@gmail.com","12345");

@Autowired
private TestRestTemplate restTemplate;
private final String baseURL = "http://localhost:8080/member";

@Test
    void a_create()
{
    String url = baseURL+"/create";
    ResponseEntity<Member> postResponce = restTemplate.postForEntity(url,member,Member.class);
    assertNotNull(postResponce);
    assertNotNull(postResponce.getBody());
    assertEquals(postResponce.getStatusCode(), HttpStatus.OK);
    member = postResponce.getBody();
    System.out.println("Saved data: "+member);
    assertEquals(member.getMemberID(),postResponce.getBody().getMemberID());
}

@Test
    void b_read()
{
    String url = baseURL+"/read/"+member.getMemberID();
    System.out.println("URL: "+url);
    ResponseEntity<Member> response = restTemplate.getForEntity(url, Member.class);
    assertEquals(member.getMemberID(),response.getBody().getMemberID());
}

@Test
    void c_update()
{
    Member updated = new Member.Builder().copy(member).setLastName("Ndzoto").build();
    String url = baseURL+"/update";
    System.out.println("URL: "+url);
    System.out.println("Updated data: "+updated);
    ResponseEntity<Member> response = restTemplate.postForEntity(url,updated, Member.class);
    assertNotNull(response.getBody());
}

@Test
    void e_delete()
{
    String url = baseURL+"/delete/"+member.getMemberID() ;
    System.out.println("URL: "+url);
    restTemplate.delete(url);

}

@Test
    void d_getAll()
{
    String url = baseURL+"/getall";
    HttpHeaders headers = new HttpHeaders();
    HttpEntity<String> entity =  new HttpEntity<>(null,headers);
    ResponseEntity<String> repsonse = restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
    System.out.println("ALL MEMBERS");
    System.out.println(repsonse);
    System.out.println(repsonse.getBody());



}

}