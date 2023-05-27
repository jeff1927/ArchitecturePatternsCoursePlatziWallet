package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.singleton.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.singleton.UserObject

class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter {

    private val homeInteractor: HomeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfer() {
        view.showLoader()
        homeInteractor.retrieveFavoriteTransfersFromCache(object :HomeContract.OnResponseCallBack{
            override fun onResponse(favoriteList: List<FavoriteTransfer>) {
                UserSingleton.getInstance().userName = "jefferson"
                UserObject.setData("Jefferson")
                view.hideLoader()
                view.showFavoriteTransfers(favoriteList)
            }
        })
    }
}