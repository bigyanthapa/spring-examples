package br.com.starcode.agenda.dao.memory;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.starcode.agenda.MemoryTestConfig;
import br.com.starcode.agenda.dao.AbstractEntradaTest;
import br.com.starcode.agenda.dao.EntradaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MemoryTestConfig.class})
@Profile("test")
@Transactional
public class EntradaDaoMemoryTest extends AbstractEntradaTest {
	
	@Autowired 
	@Qualifier("h2")
	public void setEntradaDao(EntradaDao entradaDao) {
		this.entradaDao = entradaDao;
	}
	
}
