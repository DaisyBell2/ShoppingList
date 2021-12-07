package com.daisybell.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.daisybell.shoppinglist.data.ShopListRepositoryImpl
import com.daisybell.shoppinglist.domain.ShopItem
import com.daisybell.shoppinglist.domain.useCase.DeleteShopItemUseCase
import com.daisybell.shoppinglist.domain.useCase.EditShopItemUseCase
import com.daisybell.shoppinglist.domain.useCase.GetShopListUseCase

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enable = !shopItem.enable)
        editShopItemUseCase.editShopItem(newItem)
    }
}