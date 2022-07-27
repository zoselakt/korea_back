package bankingTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.varxyz.jvx330.banking.Service.BankingService;
import com.varxyz.jvx330.banking.Service.BankingServiceimpl;
import com.varxyz.jvx330.banking.controller.AddCustomerController;

@ExtendWith(MockitoExtension.class)
public class BankingTest {
	private BankingService bankingService;
	
}
