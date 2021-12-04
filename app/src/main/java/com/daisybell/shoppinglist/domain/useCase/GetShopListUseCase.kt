package com.daisybell.shoppinglist.domain.useCase

import com.daisybell.shoppinglist.domain.ShopItem
import com.daisybell.shoppinglist.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}