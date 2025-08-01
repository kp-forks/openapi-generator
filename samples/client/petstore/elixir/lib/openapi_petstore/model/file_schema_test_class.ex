# NOTE: This file is auto generated by OpenAPI Generator 7.15.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.FileSchemaTestClass do
  @moduledoc """
  
  """

  @derive JSON.Encoder
  defstruct [
    :file,
    :files
  ]

  @type t :: %__MODULE__{
    :file => OpenapiPetstore.Model.File.t | nil,
    :files => [OpenapiPetstore.Model.File.t] | nil
  }

  alias OpenapiPetstore.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:file, :struct, OpenapiPetstore.Model.File)
     |> Deserializer.deserialize(:files, :list, OpenapiPetstore.Model.File)
  end
end

