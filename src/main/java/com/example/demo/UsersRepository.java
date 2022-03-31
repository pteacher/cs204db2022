/* UsersRepository
 *  Version information
 *  3/31/2022
 *  Copyright User
 */

package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
}
