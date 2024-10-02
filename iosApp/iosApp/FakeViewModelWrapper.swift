//
//  FakeViewModelWrapper.swift
//  iosApp
//
//  Created by Himanshu Gaur on 02/10/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import Shared

class FakeViewModelWrapper : ObservableObject{
    var viewModel:FakeViewModel
    
    init(){
        self.viewModel = ProvideViewModel.shared.getFakeViewModel()
    }
    
}
