package com.example.gb_mvp_lib

class MainPresenter(
    private val view: MainView,
    private val model: CountersModel = CountersModel()
) {


    fun counterClickOne() {
        val nextValue = model.next(0)
        view.setCounter1(nextValue.toString())
    }

    fun counterClickTwo() {
        val nextValue = model.next(1)
        view.setCounter2(nextValue.toString())
    }

    fun counterClickThree() {
        val nextValue = model.next(2)
        view.setCounter3(nextValue.toString())
    }


}