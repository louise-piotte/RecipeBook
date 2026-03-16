param(
    [string]$InputPath = 'docs/recipes/boite-de-noel.converted.library.v1.json',
    [string]$AssetOutputPath = 'app/src/main/assets/seed/boite-de-noel.converted.library.v1.json'
)

& "$PSScriptRoot/curate_boite_de_noel.ps1" -InputPath $InputPath -AssetOutputPath $AssetOutputPath
