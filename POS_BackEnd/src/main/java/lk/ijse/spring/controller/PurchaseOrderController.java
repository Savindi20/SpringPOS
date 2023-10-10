package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.service.PurchaseOrderService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase_order")
@CrossOrigin
public class PurchaseOrderController {

    //Order Table
    //Oder Details One or More

    @Autowired
    PurchaseOrderService service;


    @PostMapping
    public ResponseUtil purchaseOrder(@RequestBody OrdersDTO od) {
        service.purchaseOrder(od);
        return new ResponseUtil("Ok", "Successfully Purchased", od);
    }
}
