package com.example.bookingticket.SignupPage;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bookingticket.API.ApiService;
import com.example.bookingticket.Model.User.UserBody;
import com.example.bookingticket.Model.User.UserResponse;
import com.example.bookingticket.Repository.UserRepository;

import javax.inject.Inject;


public class SignUpViewModel extends ViewModel {
    private UserRepository userRepository;

    private LiveData<UserBody> data = new MutableLiveData<>();

    public SignUpViewModel() {
        this.userRepository = new UserRepository();
    }


    public void register(UserBody userBody) {
        data = userRepository.register(userBody);
    }

    public LiveData<UserBody> getData() {
        return data;
    }
}
