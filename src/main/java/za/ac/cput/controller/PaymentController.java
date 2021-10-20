package za.ac.cput.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;
import za.ac.cput.service.impl.PaymentService;

import java.util.Set;


@Controller
@RequestMapping("/Payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

        @RequestMapping(value = "/create",method = RequestMethod.POST)
        public String create(@ModelAttribute("payment") Payment payment)
        {
            Payment newPayment = PaymentFactory.creatPayment(payment.getPaymentAmount(),payment.getPaymentDate());
            if((newPayment.getPaymentAmount()== null)|| (newPayment.getPaymentAmount().trim().isEmpty())
                    || (newPayment.getPaymentDate()==null) || (newPayment.getPaymentDate().trim().isEmpty())

            throw new NullPointerException();

            else
                paymentService.create(newPayment);
                System.out.println("SHOW THE payment"+payment.toString());
                return "redirect:/payment/getall";

    }
    @GetMapping("/read/{paymentID}")
    public Payment read(@PathVariable int paymentID)
    {
        return paymentService.read(paymentID);
    }

    @PostMapping("/update")
    public Payment update(@RequestBody Payment payment)
    {
        return paymentService.update(payment);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return paymentService.delete(id);
    }


    @GetMapping("/getall")
    public String getAll(Model model)
    {
        Set<Payment> Paymentlist = paymentService.getAll();
        model.addAttribute("Paymentlist", Paymentlist);
        return "Paymentlist";
    }

    @RequestMapping("/new")
    public String showNewPaymentlistPage(Model model) {
        Payment payment = new Payment();
        model.addAttribute("payment",payment);

        return "newPaymentForm";
    }


}
