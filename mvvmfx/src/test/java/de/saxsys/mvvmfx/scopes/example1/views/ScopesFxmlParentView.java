package de.saxsys.mvvmfx.scopes.example1.views;

import javafx.fxml.FXML;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.ViewModel;

public class ScopesFxmlParentView implements FxmlView<ViewModel> {
    @FXML
    public ScopedFxmlViewA subviewAController;
    @FXML
    public ScopedFxmlViewB subviewBController;
}
