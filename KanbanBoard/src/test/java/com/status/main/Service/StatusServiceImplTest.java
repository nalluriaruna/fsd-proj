package com.status.main.Service;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.status.main.entity.Progress;
import com.status.main.entity.Status;
import com.status.main.repository.StatusRepository;
import com.status.main.service.StatusService;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//import static org.assertj.core.api.Assertions.fail;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



import static org.junit.jupiter.api.Assertions.*;
//public class StatusServiceImplTest {
//
//    @Mock
//    private StatusRepository statusRepository;
//
//    @InjectMocks
//    private StatusService statusService;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//    
//
//
//
//
//  @Test
//    public void createStatus() throws Exception {
//        
//        Status status = new Status(1, "Title", Progress.TESTING);
//        Status createdStatus = statusService.createStatus(status);

       
      //  Assert.assertNotNull("The createdStatus should not be null", createdStatus);   
       // assertNotEquals("The createdStatus ID should not be 0", 0, createdStatus.getId());
        //Assert.assertEquals("The createdStatus title should match", "Title", createdStatus.getTitle());
       // Assert.assertEquals("The createdStatus progress should match", Progress.DONE, createdStatus.getProgress());
//  assertNotNull(createdStatus);
//  }
//  }

//    @Test
//    public void testUpdateStatus() throws Exception {
//       
//        Status status = new Status(2, "Title", Progress.IN_PROGRESS);
//
//        
//        Status updatedStatus = statusService.updateStatus(status);
//        Assert.assertNotNull("The updatedStatus should not be null", updatedStatus);
//        Assert.assertEquals("The updatedStatus ID should match", 2, updatedStatus.getId());
//        Assert.assertEquals("The updatedStatus title should match", "Title", updatedStatus.getTitle());
//        Assert.assertEquals("The updatedStatus progress should match", Progress.IN_PROGRESS, updatedStatus.getProgress());
//    }
//
//    @Test
//    public void testGetAllStatus() throws Exception {
//        List<Status> allStatus = statusService.getAllStatus();
//
//        Assert.assertNotNull("The allStatus list should not be null", allStatus);
//        Assert.assertFalse("The allStatus list should not be empty", allStatus.isEmpty());
//        Assert.assertEquals("The allStatus list should contain the expected number of statuses", 3, allStatus.size());
//    }
//}


//
//    @Test
//    public void testCreateStatus() throws Exception {
//        // Arrange
//        Status status = new Status(1, "Task1",Progress.DONE);
//        when(statusRepository.save(status)).thenReturn(status);
//
//        // Act
//        Status result = statusService.createStatus(status);
//
//        // Assert
//        assertEquals(status, result);
//        verify(statusRepository, times(1)).save(status);
//    }
//

   


  








//    @Test
//    public void testUpdateStatus() throws Exception {
//        // Arrange
//        Status status = new Status(1, "Task1",Progress.DONE);
//        when(statusRepository.save(status)).thenReturn(status);
//
//        // Act
//        Status result = statusService.updateStatus(status);
//
//        // Assert
//        assertEquals(status, result);
//        verify(statusRepository, times(1)).save(status);
//    }
//
//    @Test
//    public void testGetAllStatus() throws Exception {
//        // Arrange
//        List<Status> statuses = Arrays.asList(
//                new Status(1, "Task1",Progress.DONE),
//                new Status(2, "Task2",Progress.BACKLOG)
//        );
//        when(statusRepository.findAll()).thenReturn(statuses);
//
//        // Act
//        List<Status> result = statusService.getAllStatus();
//
//        // Assert
//        assertEquals(statuses, result);
//        verify(statusRepository, times(1)).findAll();
//    }
//}



import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.status.main.entity.Progress;
import com.status.main.entity.Status;
import com.status.main.repository.StatusRepository;
import com.status.main.service.StatusService;
import com.status.main.service.StatusServiceImpl;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;


class StatusServiceImplTest {

    @Mock
    private StatusRepository statusRepository;

    @InjectMocks
    private StatusService statusService ;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateStatus() throws Exception {
        // Create a sample status
        Status status = new Status();
        status.setId(1);
        status.setProgress(Progress.BACKLOG);
        status.setProgress(Progress.DONE);
        status.setProgress(Progress.IN_PROGRESS);
        status.setProgress(Progress.PEER_REVIEW);
        status.setProgress(Progress.TESTING);
        // Define the behavior of the mock
        when(statusRepository.save(status)).thenReturn(status);
        Status result = statusService.createStatus(status);
        assertNotNull(result);
        assertEquals(status, result);
        
//
//        // Call the method under test
//        Status createdStatus = statusService.createStatus(status);
//
//        // Verify the result
//        assertEquals(status, createdStatus);
        verify(statusRepository, times(1)).save(status);
    }


//    @Test
//    public void testUpdateStatus() throws Exception {
//        // Create a sample status
//        Status status = new Status();
//
//        // Define the behavior of the mock
//        when(statusDao.updateStatus(status)).thenReturn(status);
//
//        // Call the method under test
//        Status updatedStatus = statusService.updateStatus(status);
//
//        // Verify the result
//        assertEquals(status, updatedStatus);
//        verify(statusDao, times(1)).updateStatus(status);
//    }
//
//    @Test
//    public void testGetAllStatus() throws Exception {
//        // Create a sample list of statuses
//        List<Status> statuses = new ArrayList<>();
//        statuses.add(new Status());
//        statuses.add(new Status());
//
//        // Define the behavior of the mock
//        when(statusDao.getAllStatus()).thenReturn(statuses);
//
//        // Call the method under test
//        List<Status> allStatus = statusService.getAllStatus();
//
//        // Verify the result
//        assertEquals(statuses, allStatus);
//        verify(statusDao, times(1)).getAllStatus();
//    }
//}
}
