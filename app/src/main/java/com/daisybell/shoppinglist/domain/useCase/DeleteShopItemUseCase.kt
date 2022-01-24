package com.daisybell.shoppinglist.domain.useCase

import com.daisybell.shoppinglist.domain.ShopItem
import com.daisybell.shoppinglist.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}