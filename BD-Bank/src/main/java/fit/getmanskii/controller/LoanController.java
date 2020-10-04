package fit.getmanskii.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fit.getmanskii.service.LoanService;
import fit.getmanskii.view.Loan;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("loans")
public class LoanController {
    private final LoanService loanService;

    @GetMapping("all")
    public ResponseEntity<List<Loan>> showAll(){
        return ResponseEntity.ok(loanService.showAll());
    }

}
