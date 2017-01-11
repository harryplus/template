package com.honliv.template.contract;


import com.honliv.template.base.CoreBaseModel;
import com.honliv.template.base.CoreBasePresenter;
import com.honliv.template.base.CoreBaseView;

/**
 * Created by Rodin on 2016/11/15.
 */
public interface FirstContract {
    interface FirstModel extends CoreBaseModel {
    }

    interface FirstView extends CoreBaseView {
    }

    interface FirstProfessorView extends CoreBaseView {
    }

    interface FirstDetailView extends CoreBaseView {
    }

    interface FirstHomeView extends CoreBaseView {
    }

    interface FirstGuideView extends CoreBaseView {
    }

    interface FirstSelectDoctorView extends CoreBaseView {
    }

    interface FirstDetailModel extends CoreBaseModel {
    }

    interface FirstProfessorModel extends CoreBaseModel {
    }

    interface FirstGuideModel extends CoreBaseModel {
    }

    interface FirstSelectDoctorModel extends CoreBaseModel {
    }

    abstract class FirstPresenter extends CoreBasePresenter<FirstModel, FirstView> {
    }

    abstract class FirstDetailPresenter extends CoreBasePresenter<FirstDetailModel, FirstDetailView> {
    }

    abstract class FirstHomePresenter extends CoreBasePresenter<FirstHomeModel, FirstHomeView> {
    }

    interface FirstHomeModel extends CoreBaseModel {
    }

    abstract class FirstProfessorPresenter extends CoreBasePresenter<FirstProfessorModel, FirstProfessorView> {
    }

    abstract class FirstGuidePresenter extends CoreBasePresenter<FirstGuideModel, FirstGuideView> {
    }

    abstract class FirstSelectDoctorPresenter extends CoreBasePresenter<FirstSelectDoctorModel, FirstSelectDoctorView> {
    }
}