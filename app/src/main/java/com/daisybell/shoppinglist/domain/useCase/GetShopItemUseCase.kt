package com.daisybell.shoppinglist.domain.useCase

import com.daisybell.shoppinglist.domain.ShopItem
import com.daisybell.shoppinglist.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}