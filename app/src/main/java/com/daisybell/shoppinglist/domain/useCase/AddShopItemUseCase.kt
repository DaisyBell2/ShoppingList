package com.daisybell.shoppinglist.domain.useCase

import com.daisybell.shoppinglist.domain.ShopItem
import com.daisybell.shoppinglist.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}