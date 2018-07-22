/**
 * 
 */
package simulate.callcenter;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import simulate.callcenter.model.PhoneRecord;

/**
 * @author Ron
 *
 */
@Component
public interface PhoneRecordRepository extends CrudRepository<PhoneRecord, Long> {

	List<PhoneRecord> findByIsSomeoneAnswer(boolean isSomeoneAnswer);

	List<PhoneRecord> findByIsSolved(boolean isSolved);
}
