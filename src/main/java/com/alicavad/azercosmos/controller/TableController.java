package com.alicavad.azercosmos.controller;

import com.alicavad.azercosmos.entity.TableF15;
import com.alicavad.azercosmos.entity.TableF16;
import com.alicavad.azercosmos.entity.TableF17;
import com.alicavad.azercosmos.entity.TableF18;
import com.alicavad.azercosmos.service.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/command")
public class TableController {

    private final TableService tableService;


    @GetMapping("/f15")
    public ResponseEntity<?> getAllDataFromF15() {
        List<TableF15> tableF15 = tableService.getAllDataFromF15();
        return new ResponseEntity<>(tableF15, HttpStatus.OK);
    }

    @GetMapping("/f16")
    public ResponseEntity<?> getAllDataFromF16() {
        List<TableF16> tableF16 = tableService.getAllDataFromF16();
        return new ResponseEntity<>(tableF16, HttpStatus.OK);
    }

    @GetMapping("/f17")
    public ResponseEntity<?> getAllDataFromF17() {
        List<TableF17> tableF17 = tableService.getAllDataFromF17();
        return new ResponseEntity<>(tableF17, HttpStatus.OK);
    }

    @GetMapping("/f18")
    public ResponseEntity<?> getAllDataFromF18() {
        List<TableF18> tableF18 = tableService.getAllDataFromF18();
        return new ResponseEntity<>(tableF18, HttpStatus.OK);
    }

}
